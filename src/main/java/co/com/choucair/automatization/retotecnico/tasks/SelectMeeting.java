package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.SelectMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectMeeting implements Task {

    public static SelectMeeting thePage() {
        return Tasks.instrumented(SelectMeeting.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectMeetingPage.ICON_MEETING),
                Click.on(SelectMeetingPage.MEETINGS)
        );
    }
}
