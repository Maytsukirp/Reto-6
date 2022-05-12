package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.FillNewBusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillNewBussinessUnit implements Task {
    private List<StartData> data;

    public FillNewBussinessUnit(List<StartData> data) {
        this.data = data;
    }

    public static FillNewBussinessUnit thePage(List<StartData> data) {
        return Tasks.instrumented(FillNewBussinessUnit.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(FillNewBusinessUnitPage.ICON_NEW_BUSSINESS_UNIT),
                Enter.theValue(data.get(0).getStrNameNewBusinessUnit()).into(FillNewBusinessUnitPage.TEXT_NEW_BUSINESS_UNIT),
                Click.on(FillNewBusinessUnitPage.CONTAINER_PARENT_UNIT),
                Enter.theValue(data.get(0).getStrParentUnit()).into(FillNewBusinessUnitPage.PARENT_UNIT).thenHit(Keys.ENTER),
                Click.on(FillNewBusinessUnitPage.APPLY_CHANGES),
                Click.on(FillNewBusinessUnitPage.SAVE)
        );

    }
}
