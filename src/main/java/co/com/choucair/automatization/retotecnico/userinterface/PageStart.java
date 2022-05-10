package co.com.choucair.automatization.retotecnico.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://serenity.is/demo/")

public class PageStart extends PageObject {

    public static final Target BOTTON_JOIN = Target.the("Botton sign in")
            .located(By.xpath("/html/body/div[1]/div/div[1]/form/div[3]/button"));

}
