package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.MeetingIcon;
import co.com.choucair.automatization.retotecnico.userinterface.OrganizationIcon;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
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
                Click.on(MeetingIcon.ICON_MEETING),
                Click.on(MeetingIcon.MEETINGS)
        );
    }
}
