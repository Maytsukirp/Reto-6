package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.userinterface.FillBusinessUnitDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillBusinessUnitData implements Task {
    private List<StartSharpData> data;

    public FillBusinessUnitData(List<StartSharpData> data) {

        this.data = data;
    }

    public static FillBusinessUnitData inTheBusinessUnit(List<StartSharpData> data) {
        return Tasks.instrumented(FillBusinessUnitData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(FillBusinessUnitDataPage.ICON_NEW_BUSSINESS_UNIT),
                Enter.theValue(data.get(0).getStrNameNewBusinessUnit()).into(FillBusinessUnitDataPage.TEXT_NEW_BUSINESS_UNIT),
                Click.on(FillBusinessUnitDataPage.CONTAINER_PARENT_UNIT),
                Enter.theValue(data.get(0).getStrParentUnit()).into(FillBusinessUnitDataPage.PARENT_UNIT).thenHit(Keys.ENTER),
                Click.on(FillBusinessUnitDataPage.APPLY_CHANGES),
                Click.on(FillBusinessUnitDataPage.SAVE)
        );

    }
}
