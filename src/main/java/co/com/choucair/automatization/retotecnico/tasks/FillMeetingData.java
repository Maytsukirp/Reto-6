package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.FillMeetingDataPage.*;
import static net.serenitybdd.screenplay.actions.SelectFromOptions.*;

public class FillMeetingData implements Task {
    private List<StartSharpData> data;

    public FillMeetingData(List<StartSharpData> data) {

        this.data = data;
    }

    public static FillMeetingData inTheMeeting(List<StartSharpData> data) {
        return Tasks.instrumented(FillMeetingData.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NEW_MEETING),
                Enter.theValue(data.get(0).getStrMeetingName()).into(MEETING_NAME),
                Click.on(CONTAINER_MEETING_TYPE),
                Enter.theValue(data.get(0).getStrMeetingType()).into(MEETING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).getStrMeetingNumber()).into(MEETING_NUMBER),
                Enter.theValue(data.get(0).getStrStarDate()).into(START_DATE),
                byVisibleText(data.get(0).getStrStarDateHour()).from((START_DATE_HOUR)),
                Enter.theValue(data.get(0).getStrEndDate()).into(END_DATE),
                byVisibleText(data.get(0).getStrEndDateHour()).from(END_DATE_HOUR),
                Click.on(CONTAINER_LOCATION),
                Enter.theValue(data.get(0).getStrLocation()).into(LOCATION).thenHit(Keys.ENTER),
                Click.on(CONTAINER_UNIT),
                Enter.theValue(data.get(0).getStrUnit()).into(UNIT).thenHit(Keys.ENTER),
                Click.on(CONTAINER_ORGANIZED),
                Enter.theValue(data.get(0).getStrOrganized()).into(ORGANIZED).thenHit(Keys.ENTER),
                Click.on(CONTAINER_REPORTER),
                Enter.theValue(data.get(0).getStrReporter()).into(REPORTER).thenHit(Keys.ENTER),
                Click.on(CONTAINER_ATTENDEE),
                Enter.theValue(data.get(0).getStrAttendee()).into(ATTENDEE_LIST).thenHit(Keys.ENTER),
                Click.on(APPLY_CHANGE_MEETING),
                Click.on(SAVE_MEETING)
        );
    }
}
