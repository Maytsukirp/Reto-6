package co.com.choucair.automatization.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automatization.retotecnico.userinterface.SelectTheMeetingPage.*;

public class SelectTheMeeting implements Task {

    public static SelectTheMeeting onThePage() {

        return Tasks.instrumented(SelectTheMeeting.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ICON_MEETING),
                Click.on(MEETINGS)
        );
    }
}
