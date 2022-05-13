package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.userinterface.LoginStartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LoginStart implements Task {

    private List<StartSharpData> data;

    public LoginStart(List<StartSharpData> data) {
        this.data = data;
    }

    public static LoginStart thePage(List<StartSharpData> data) {
        return Tasks.instrumented(LoginStart.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginStartPage.USERNAME),
                Enter.theValue(data.get(0).getStrNameUser()).into(LoginStartPage.USERNAME),
                Click.on(LoginStartPage.PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(LoginStartPage.PASSWORD),
                Click.on(LoginStartPage.SIGN_IN_BOTTON));

    }
}
