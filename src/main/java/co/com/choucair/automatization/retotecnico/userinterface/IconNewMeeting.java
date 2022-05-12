package co.com.choucair.automatization.retotecnico.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IconNewMeeting {

    public static final Target NEW_MEETING = Target.the("New Meeting ")
            .locatedBy(".add-button .button-inner");

    public static final Target TEXT_MEETINGNAME= Target.the("Meeting name")
            .locatedBy("[name='MeetingName']");

    public static final Target CONTAINER_MEETINGTYPE = Target.the("Container Meeting type")
            .locatedBy(".required.select2-container .select2-chosen");

    public static final Target MEETINGTYPE = Target.the("Meeting type")
            .locatedBy("[aria-owns='select2-results-6']");

    public static final Target MEETINGNUMBER = Target.the("Meeting Number")
            .locatedBy("[name='MeetingNumber']");

    public static final Target STARTDATE = Target.the("Start date")
            .locatedBy("[name='StartDate']");

    public static final Target STARTDATE_HOUR = Target.the("Start Date Hour")
            .locatedBy(".StartDate > .time");

    public static final Target ENDDATE = Target.the("End date")
            .locatedBy("[name='EndDate']");

    public static final Target ENDDATE_HOUR = Target.the("End Date Hour")
            .locatedBy(".EndDate > .time");

    public static final Target CONTAINER_LOCATION = Target.the("Container location")
            .locatedBy(".LocationId .select2-chosen");

    public static final Target LOCATION = Target.the("Location")
            .locatedBy("[aria-owns='select2-results-7']");

    public static final Target CONTAINER_UNIT = Target.the("Container unit")
            .locatedBy(".UnitId .select2-chosen");

    public static final Target UNIT = Target.the("Unit")
            .locatedBy("[aria-owns='select2-results-8']");

    public static final Target CONTAINER_ORGANIZED = Target.the("Container Organized By")
            .locatedBy(".OrganizerContactId .select2-chosen");

    public static final Target ORGANIZED = Target.the("Organized By")
            .locatedBy("[aria-owns='select2-results-9']");

    public static final Target CONTAINER_REPORTER = Target.the("Container Reporter")
            .locatedBy(".ReporterContactId .select2-choice");

    public static final Target REPORTER = Target.the("Reporter")
            .locatedBy("[aria-owns='select2-results-10']");

    public static final Target CONTAINER_ATTENDEE = Target.the("Container Attendee List")
            .locatedBy("//span[.='--select contact to add--']");

    public static final Target ATTENDEE_LIST = Target.the("Attendee List")
            .locatedBy("[aria-owns='select2-results-12']");

    public static final Target APPLYCHANGE_MEETING = Target.the("Apply Changes")
            .locatedBy(".apply-changes-button");

    public static final Target SAVE_MEETING = Target.the("Save meeting")
            .locatedBy(".save-and-close-button .button-inner");

    public static final Target TEXT_SEARCH = Target.the("Text Search")
            .locatedBy(".s-Serenity-QuickSearchInput");

    public static final Target TEXT_TABLE = Target.the("Text Table")
            .locatedBy(".grid-canvas-left.grid-canvas-top > div:nth-of-type(1) > .l1");

}
