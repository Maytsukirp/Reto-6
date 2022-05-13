package co.com.choucair.automatization.retotecnico.stepdefinitions;
import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.questions.AnswerLogin;
import co.com.choucair.automatization.retotecnico.tasks.LoginStart;
import co.com.choucair.automatization.retotecnico.tasks.OpenPageStar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Before
    public void setState(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^May login to the StartSharp$")
    public void mayLoginToTheStartSharp() {
        OnStage.theActorCalled("May").wasAbleTo(OpenPageStar.thePage());
    }


    @When("^She has entered the credentials$")
    public void sheHasEnteredTheCredentials(List<StartSharpData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginStart.thePage(data));
    }

    @Then("^Login is successful$")
    public void loginIsSuccessful(List<StartSharpData> data) {
        theActorInTheSpotlight().should(seeThat(AnswerLogin.theD(data.get(0).getStrTextStartSharp())));

    }
}
