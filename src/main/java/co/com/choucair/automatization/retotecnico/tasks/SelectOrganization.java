package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.OrganizationIcon;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectOrganization implements Task {

    public static SelectOrganization thePage() {
        return Tasks.instrumented(SelectOrganization.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrganizationIcon.ICON_ORGANIZATION),
                Click.on(OrganizationIcon.BUSINESS_UNIT)
        );
    }
}
