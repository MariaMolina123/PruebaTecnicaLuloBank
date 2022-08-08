package com.lulobank.stepdefinitions;

import static com.lulobank.constants.Urlconstants.BASE_CREATE;
import static com.lulobank.constants.Valueconstants.VALUEEXITOSO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import com.lulobank.tasks.ExecutePostToken;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class CreateEmployeeStepDefinitions {

    @When("proporciona la informacion del usuario")
    public void proporcionaLaInformacionDelUsuario( DataTable userInformation) {
        theActorInTheSpotlight().attemptsTo(ExecutePostToken.createUser(BASE_CREATE, userInformation));
    }

    @Then("valida que la respuesta tenga el status code sea correcto")
    public void validaQueLaRespuestaTengaElNombreYElStatusCodeSeaCorrecto(){
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(VALUEEXITOSO)
                ));
    }

}
