package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.OpenStartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenStart implements Task {
    private OpenStartPage openStartPage;
    //private List<StartData> data;


    public static OpenStart thePage() {

        return Tasks.instrumented(OpenStart.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openStartPage),
                Click.on(OpenStartPage.BOTTON_JOIN));
    }
}
