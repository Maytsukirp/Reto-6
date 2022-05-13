package co.com.choucair.automatization.retotecnico.stepdefinitions;
import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.questions.AnswerBusinessUnit;
import co.com.choucair.automatization.retotecnico.tasks.FillNewBussinessUnit;
import co.com.choucair.automatization.retotecnico.tasks.OpenStart;
import co.com.choucair.automatization.retotecnico.tasks.SelectOrganization;
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

    @Given("^May wants to register unity on the Start website$")
    public void mayWantsToRegisterUnityOnTheStartWebsite() {
        OnStage.theActorCalled("May").wasAbleTo(OpenStart.thePage());

    }


    @When("^enter all requested information$")
    public void enterAllRequestedInformation(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrganization.thePage(),
                FillNewBussinessUnit.thePage(data) );
    }

    @Then("^registration is successfully completed$")
    public void registrationIsSuccessfullyCompleted(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerBusinessUnit.theD(data)));
    }
}
