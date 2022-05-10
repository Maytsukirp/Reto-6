package co.com.choucair.automatization.retotecnico.stepdefinitions;
import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.questions.Answer;
import co.com.choucair.automatization.retotecnico.questions.Answer2;
import co.com.choucair.automatization.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StartStepDefinition {

    @Before
    public void setState(){

        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^May wants to register unity on the Start website$")
    public void mayWantsToRegisterUnityOnTheStartWebsite() {
        OnStage.theActorCalled("May").wasAbleTo(OpenStart.thePage());

    }


    @When("^enter all requested information$")
    public void enterAllRequestedInformation(List<StartData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectOrganization.thePage(),
                FillNewBussinessUnit.thePage(data) );
    }

    @Then("^registration is successfully completed$")
    public void registrationIsSuccessfullyCompleted(List<StartData> data) {
        theActorInTheSpotlight().should(seeThat(Answer2.theD(data.get(0).getStrFinishTextUnits())));
    }



    @Given("^May wants to register a meeting on a unit$")
    public void mayWantsToRegisterAMeetingOnAUnit() {
        OnStage.theActorCalled("May").wasAbleTo(OpenStart.thePage());

    }


    @When("^enter all requested information in the meeting$")
    public void enterAllRequestedInformationInTheMeeting(List<StartData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectMeeting.thePage(), FillNewMeeting.thePage(data));
    }

    @Then("^registration is completed$")
    public void registrationIsCompleted(List<StartData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theD(data)));
    }


}
