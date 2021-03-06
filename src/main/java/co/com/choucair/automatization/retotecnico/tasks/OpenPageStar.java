package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.AcessTheStartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageStar implements Task {
    private AcessTheStartPage acessTheStartPage;

    public static OpenPageStar thePage() {

        return Tasks.instrumented(OpenPageStar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(acessTheStartPage));
    }
}
