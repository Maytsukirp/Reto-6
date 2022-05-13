package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.FillBusinessUnitDataPage.*;

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
                Click.on(ICON_NEW_BUSSINESS_UNIT),
                Enter.theValue(data.get(0).getStrNameNewBusinessUnit()).into(TEXT_NEW_BUSINESS_UNIT),
                Click.on(CONTAINER_PARENT_UNIT),
                Enter.theValue(data.get(0).getStrParentUnit()).into(PARENT_UNIT).thenHit(Keys.ENTER),
                Click.on(APPLY_CHANGES),
                Click.on(SAVE)
        );

    }
}
