package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.LoginStartPage.*;

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
                Click.on(USERNAME),
                Enter.theValue(data.get(0).getStrNameUser()).into(USERNAME),
                Click.on(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Click.on(SIGN_IN_BOTTON));

    }
}
