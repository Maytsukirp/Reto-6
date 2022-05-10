package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
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
                Click.on(IconNewBusinessUnit.ICON_NEWBUSINESSUNIT),
                Enter.theValue(data.get(0).getStrNameNewBusinessUnit()).into(IconNewBusinessUnit.TEXTNAMEBUSINESSUNIT),
                Click.on(IconNewBusinessUnit.CONTAINER_PARENTUNIT),
                Enter.theValue(data.get(0).getStrParentUnit()).into(IconNewBusinessUnit.PARENTUNIT).thenHit(Keys.ENTER),
                Click.on(IconNewBusinessUnit.APPLYCHANGES),
                Click.on(IconNewBusinessUnit.SAVE)
        );

    }
}
