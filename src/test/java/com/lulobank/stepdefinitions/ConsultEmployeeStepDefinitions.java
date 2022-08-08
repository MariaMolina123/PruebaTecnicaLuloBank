package com.lulobank.stepdefinitions;

import com.lulobank.tasks.ExecutionGetToken;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.lulobank.constants.Urlconstants.BASE_CONSULT;
import static com.lulobank.constants.Valueconstants.VALUEEXITOSO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class ConsultEmployeeStepDefinitions {


    @When("consulta en el endpoint por id {string}")
    public void consultaEnElEndpointPorId(String id) {
        theActorInTheSpotlight().attemptsTo(ExecutionGetToken.getInformation(BASE_CONSULT, id));
    }

    @Then("valida que el status code sea exitoso y data llegue vacio")
    public void validaQueElStatusCodeSeaExitosoYDataLlegueVacio() {
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(VALUEEXITOSO).body(
                "data", equalTo(null))));
    }
}
