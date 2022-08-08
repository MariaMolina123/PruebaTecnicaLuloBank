package com.lulobank.stepdefinitions;

import static com.lulobank.constants.Urlconstants.*;
import static com.lulobank.constants.Valueconstants.VALUEEXITOSO;
import static com.lulobank.constants.Valueconstants.VALUENOTFOUND;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import com.lulobank.tasks.ExecutionGetToken;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class DeleteEmployeeStepDefinitions {
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("maria");
    }

    @Given("the actor establece la base url del servicio")
    public void theActorEstableceLaBaseUrlDelServicio() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(URL_DUMMY));
    }

    @When("elimina en el endpoint por id {string}")
    public void eliminaEnElEndpointPorId( String id) {
        theActorInTheSpotlight().attemptsTo(ExecutionGetToken.getInformation(BASE_DELETE, id));
    }

    @Then("valida que el status code sea exitoso")
    public void validaQueElStatusCodeSeaExitoso() {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(VALUEEXITOSO)));
    }

    @Then("valida que el status code sea fallido")
    public void validaQueElStatusCodeSeaFallido() {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(VALUENOTFOUND)));
    }

}
