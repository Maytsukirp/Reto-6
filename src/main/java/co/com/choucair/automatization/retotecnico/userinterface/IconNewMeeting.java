package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IconNewMeeting {

    public static final Target NEW_MEETING = Target.the("New Meeting ")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]"));

    public static final Target TEXT_MEETINGNAME= Target.the("Meeting name")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[1]/input"));

    public static final Target CONTAINER_MEETINGTYPE = Target.the("Container Meeting type")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[2]/div[1]/a"));

    public static final Target MEETINGTYPE = Target.the("Meeting type")
            .located(By.xpath("/html/body/div[6]/div/input"));

    public static final Target MEETINGNUMBER = Target.the("Meeting Number")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[3]/input"));

    public static final Target STARTDATE = Target.the("Start date")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/input"));

    public static final Target STARTDATE_HOUR = Target.the("Start Date Hour")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select"));

    public static final Target ENDDATE = Target.the("End date")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/input"));

    public static final Target ENDDATE_HOUR = Target.the("End Date Hour")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[5]/select"));

    public static final Target CONTAINER_LOCATION = Target.the("Container location")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[6]/div[1]/a/span[1]"));

    public static final Target LOCATION = Target.the("Location")
            .located(By.xpath("/html/body/div[7]/div/input"));

    public static final Target CONTAINER_UNIT = Target.the("Container unit")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[7]/div[1]/a/span[1]"));

    public static final Target UNIT = Target.the("Unit")
            .located(By.xpath("/html/body/div[8]/div/input"));

    public static final Target CONTAINER_ORGANIZED = Target.the("Container Organized By")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[8]/div[1]/a"));

    public static final Target ORGANIZED = Target.the("Organized By")
            .located(By.xpath("/html/body/div[9]/div/input"));

    public static final Target CONTAINER_REPORTER = Target.the("Container Reporter")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[9]/div[1]/a/span[1]"));

    public static final Target REPORTER = Target.the("Reporter")
            .located(By.xpath("/html/body/div[10]/div/input"));

    public static final Target CONTAINER_ATTENDEE = Target.the("Container Attendee List")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[10]/div[1]/div[1]/div[2]/a/span[1]"));

    public static final Target ATTENDEE_LIST = Target.the("Attendee List")
            .located(By.xpath("/html/body/div[11]/div/input"));

    public static final Target APPLYCHANGE_MEETING = Target.the("Apply Changes")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[2]"));

    public static final Target SAVE_MEETING = Target.the("Save meeting")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]"));

    public static final Target TEXT_MEETINGS = Target.the("Text Meeting")
            .located(By.xpath("/html/body/main/section/div/div[1]/div"));

    public static final Target TEXT_SEARCH = Target.the("Text Search")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[1]/input"));

    public static final Target TEXT_TABLE = Target.the("Text Table")
            .located(By.xpath("/html/body/main/section/div/div[3]/div[4]/div[3]/div/div[1]/div[2]"));




}
