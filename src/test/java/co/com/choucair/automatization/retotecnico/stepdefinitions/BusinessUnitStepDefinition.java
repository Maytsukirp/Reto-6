package co.com.choucair.automatization.retotecnico.stepdefinitions;
import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.questions.AnswerInBusinessUnit;
import co.com.choucair.automatization.retotecnico.tasks.FillBusinessUnitData;
import co.com.choucair.automatization.retotecnico.tasks.AcessTheStartSharp;
import co.com.choucair.automatization.retotecnico.tasks.SelectTheOrganization;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class BusinessUnitStepDefinition {

    @Before
    public void setState(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^May has joined StartSharp$")
    public void mayHasJoinedStartSharp() {
        OnStage.theActorCalled("May").wasAbleTo(AcessTheStartSharp.page());
    }

    @When("^enter all requested information on business unit$")
    public void enterAllRequestedInformationOnBusinessUnit(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheOrganization.onThePage(),
                FillBusinessUnitData.inTheBusinessUnit(data) );
    }

    @Then("^registration is successfully completed$")
    public void registrationIsSuccessfullyCompleted(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerInBusinessUnit.forTheCreatedBusinessUnit(data)));
    }
}
