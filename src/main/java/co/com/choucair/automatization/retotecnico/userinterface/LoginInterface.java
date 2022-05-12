package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginInterface {

    public static final Target USERNAME = Target.the("Username")
            .locatedBy("[name='Username']");

    public static final Target PASSWORD = Target.the("Password")
            .locatedBy("[name='Password']");

    public static final Target SIGN_IN_BOTTON = Target.the("Botton sign in")
            .locatedBy(".btn");
}
