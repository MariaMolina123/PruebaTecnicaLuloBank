package com.lulobank.util.enums;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Actor {


    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("maria");
    }
}
