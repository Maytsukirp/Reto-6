package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.AcessTheStartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.automatization.retotecnico.userinterface.AcessTheStartPage.*;

public class AcessTheStartSharp implements Task {
    private AcessTheStartPage acessTheStartPage;


    public static AcessTheStartSharp page() {

        return Tasks.instrumented(AcessTheStartSharp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(acessTheStartPage),
                Click.on(BOTTON_JOIN));
    }
}
