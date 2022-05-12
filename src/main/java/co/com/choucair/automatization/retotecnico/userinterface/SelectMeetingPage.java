package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectMeetingPage {

    public static final Target ICON_MEETING= Target.the("Icon Meeting")
            .locatedBy("//span[.='Meeting']");

    public static final Target MEETINGS = Target.the("Schedule meetings")
            .locatedBy("//span[.='Meetings']");
}
