package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewMeeting;
import co.com.choucair.automatization.retotecnico.userinterface.LoginInterface;
import co.com.choucair.automatization.retotecnico.userinterface.PageStart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

public class LoginStart implements Task {

    private List<StartData> data;

    public LoginStart(List<StartData> data) {
        this.data = data;
    }

    public static LoginStart thePage(List<StartData> data) {
        return Tasks.instrumented(LoginStart.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginInterface.USERNAME),
                Enter.theValue(data.get(0).getStrNameUser()).into(LoginInterface.USERNAME),
                Click.on(LoginInterface.PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(LoginInterface.PASSWORD),
                Click.on(LoginInterface.SIGN_IN_BOTTON));

    }
}
