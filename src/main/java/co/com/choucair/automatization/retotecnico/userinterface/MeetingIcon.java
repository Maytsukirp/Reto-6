package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingIcon {

    public static final Target ICON_MEETING= Target.the("Icon Meeting")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/a/span"));

    public static final Target MEETINGS = Target.the("Schedule meetings")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/ul/li[1]/a/span"));
}
