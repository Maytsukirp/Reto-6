package co.com.choucair.automatization.retotecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automatization.retotecnico.userinterface.SelectTheOrganizationPage.*;

public class SelectTheOrganization implements Task {

    public static SelectTheOrganization onThePage() {

        return Tasks.instrumented(SelectTheOrganization.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ICON_ORGANIZATION),
                Click.on(BUSINESS_UNIT)
        );
    }
}
