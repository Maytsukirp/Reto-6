package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class FillNewMeeting implements Task {
    private List<StartData> data;

    public FillNewMeeting(List<StartData> data) {
        this.data = data;
    }

    public static FillNewMeeting thePage(List<StartData> data) {
        return Tasks.instrumented(FillNewMeeting.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IconNewMeeting.NEW_MEETING),
                Enter.theValue(data.get(0).getStrMeetingName()).into(IconNewMeeting.TEXT_MEETINGNAME),
                Click.on(IconNewMeeting.CONTAINER_MEETINGTYPE),
                Enter.theValue(data.get(0).getStrMeetingType()).into(IconNewMeeting.MEETINGTYPE).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).getStrMeetingNumber()).into(IconNewMeeting.MEETINGNUMBER),
                Enter.theValue(data.get(0).getStrStarDate()).into(IconNewMeeting.STARTDATE),

                SelectFromOptions.byVisibleText(data.get(0).getStrStarDateHour()).from((IconNewMeeting.STARTDATE_HOUR)),

                Enter.theValue(data.get(0).getStrEndDate()).into(IconNewMeeting.ENDDATE),

                SelectFromOptions.byVisibleText(data.get(0).getStrEndDateHour()).from(IconNewMeeting.ENDDATE_HOUR),

                Click.on(IconNewMeeting.CONTAINER_LOCATION),
                Enter.theValue(data.get(0).getStrLocation()).into(IconNewMeeting.LOCATION).thenHit(Keys.ENTER),
                Click.on(IconNewMeeting.CONTAINER_UNIT),
                Enter.theValue(data.get(0).getStrUnit()).into(IconNewMeeting.UNIT).thenHit(Keys.ENTER),
                Click.on(IconNewMeeting.CONTAINER_ORGANIZED),
                Enter.theValue(data.get(0).getStrOrganized()).into(IconNewMeeting.ORGANIZED).thenHit(Keys.ENTER),
                Click.on(IconNewMeeting.CONTAINER_REPORTER),
                Enter.theValue(data.get(0).getStrReporter()).into(IconNewMeeting.REPORTER).thenHit(Keys.ENTER),
                Click.on(IconNewMeeting.CONTAINER_ATTENDEE),
                Enter.theValue(data.get(0).getStrAttendee()).into(IconNewMeeting.ATTENDEE_LIST).thenHit(Keys.ENTER),

                Click.on(IconNewMeeting.APPLYCHANGE_MEETING),
                Click.on(IconNewMeeting.SAVE_MEETING)
        );
    }
}
