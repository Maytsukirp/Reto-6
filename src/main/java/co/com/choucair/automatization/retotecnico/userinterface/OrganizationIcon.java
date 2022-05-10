package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrganizationIcon {

    public static final Target ICON_ORGANIZATION= Target.the("Icon organization")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]/a/span"));

    public static final Target BUSINESS_UNIT = Target.the("Icon business unit")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]/ul/li[1]/a/span"));
}
