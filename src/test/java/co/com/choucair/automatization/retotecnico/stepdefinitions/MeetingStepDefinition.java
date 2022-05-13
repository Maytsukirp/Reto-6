package co.com.choucair.automatization.retotecnico.stepdefinitions;
import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.questions.AnswerMeeting;
import co.com.choucair.automatization.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class MeetingStepDefinition {

    @Before
    public void setState(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^May wants to register a meeting on a unit$")
    public void mayWantsToRegisterAMeetingOnAUnit() {
        OnStage.theActorCalled("May").wasAbleTo(OpenStart.thePage());

    }


    @When("^enter all requested information in the meeting$")
    public void enterAllRequestedInformationInTheMeeting(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectMeeting.thePage(), FillNewMeeting.thePage(data));
    }

    @Then("^registration is completed$")
    public void registrationIsCompleted(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerMeeting.theD(data)));
    }


}
