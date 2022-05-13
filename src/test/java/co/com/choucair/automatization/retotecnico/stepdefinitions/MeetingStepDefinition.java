package co.com.choucair.automatization.retotecnico.stepdefinitions;
import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.questions.AnswerInMeeting;
import co.com.choucair.automatization.retotecnico.tasks.*;
import cucumber.api.java.Before;
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

    @When("^enter all requested information in the meeting$")
    public void enterAllRequestedInformationInTheMeeting(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectTheMeeting.onThePage(),
                FillMeetingData.inTheMeeting(data));
    }

    @Then("^registration is completed$")
    public void registrationIsCompleted(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerInMeeting.forTheCreatedMeeting(data)));
    }

}
