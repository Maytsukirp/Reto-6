package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.SelectTheOrganizationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectTheOrganization implements Task {

    public static SelectTheOrganization onThePage() {

        return Tasks.instrumented(SelectTheOrganization.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SelectTheOrganizationPage.ICON_ORGANIZATION),
                Click.on(SelectTheOrganizationPage.BUSINESS_UNIT)
        );
    }
}
