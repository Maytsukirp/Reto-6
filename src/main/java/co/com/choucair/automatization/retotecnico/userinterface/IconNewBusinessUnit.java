package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IconNewBusinessUnit {

    public static final Target ICON_NEWBUSINESSUNIT= Target.the("Icon new bussiness unit")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]/div/span"));

    public static final Target TEXTNAMEBUSINESSUNIT = Target.the("Text new business unit")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input"));

    public static final Target CONTAINER_PARENTUNIT = Target.the("Parent Unit")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div/div[1]/div/div/div[2]/div[1]/a/span[1]"));

    public static final Target PARENTUNIT = Target.the("Parent Unit")
            .located(By.xpath("/html/body/div[7]/div/input"));

    public static final Target APPLYCHANGES = Target.the("Apply changes")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[2]"));

    public static final Target SAVE = Target.the("Save Changes")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[1]"));

    public static final Target TEXT_BUSINESS_UNIT = Target.the("Text business unit")
            .located(By.xpath("/html/body/main/section/div/div[1]/div"));
}
