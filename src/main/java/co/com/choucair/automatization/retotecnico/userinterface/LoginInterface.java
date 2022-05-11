package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginInterface {

    public static final Target USERNAME = Target.the("Username")
            .located(By.xpath("/html/body/div[1]/div/div[1]/form/div[1]/div/div/div[1]/input"));

    public static final Target PASSWORD = Target.the("Password")
            .located(By.xpath("/html/body/div[1]/div/div[1]/form/div[1]/div/div/div[2]/input"));

    public static final Target SIGN_IN_BOTTON = Target.the("Botton sign in")
            .located(By.xpath("/html/body/div[1]/div/div[1]/form/div[3]/button"));

    public static final Target TEXT_STARTSHARP = Target.the("Text StartSharp")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/h5"));


}
