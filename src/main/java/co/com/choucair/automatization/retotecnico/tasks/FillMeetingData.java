package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.userinterface.FillMeetingDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

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
                Click.on(FillMeetingDataPage.NEW_MEETING),
                Enter.theValue(data.get(0).getStrMeetingName()).into(FillMeetingDataPage.MEETING_NAME),
                Click.on(FillMeetingDataPage.CONTAINER_MEETING_TYPE),
                Enter.theValue(data.get(0).getStrMeetingType()).into(FillMeetingDataPage.MEETING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).getStrMeetingNumber()).into(FillMeetingDataPage.MEETING_NUMBER),
                Enter.theValue(data.get(0).getStrStarDate()).into(FillMeetingDataPage.START_DATE),
                SelectFromOptions.byVisibleText(data.get(0).getStrStarDateHour()).from((FillMeetingDataPage.START_DATE_HOUR)),
                Enter.theValue(data.get(0).getStrEndDate()).into(FillMeetingDataPage.END_DATE),
                SelectFromOptions.byVisibleText(data.get(0).getStrEndDateHour()).from(FillMeetingDataPage.END_DATE_HOUR),
                Click.on(FillMeetingDataPage.CONTAINER_LOCATION),
                Enter.theValue(data.get(0).getStrLocation()).into(FillMeetingDataPage.LOCATION).thenHit(Keys.ENTER),
                Click.on(FillMeetingDataPage.CONTAINER_UNIT),
                Enter.theValue(data.get(0).getStrUnit()).into(FillMeetingDataPage.UNIT).thenHit(Keys.ENTER),
                Click.on(FillMeetingDataPage.CONTAINER_ORGANIZED),
                Enter.theValue(data.get(0).getStrOrganized()).into(FillMeetingDataPage.ORGANIZED).thenHit(Keys.ENTER),
                Click.on(FillMeetingDataPage.CONTAINER_REPORTER),
                Enter.theValue(data.get(0).getStrReporter()).into(FillMeetingDataPage.REPORTER).thenHit(Keys.ENTER),
                Click.on(FillMeetingDataPage.CONTAINER_ATTENDEE),
                Enter.theValue(data.get(0).getStrAttendee()).into(FillMeetingDataPage.ATTENDEE_LIST).thenHit(Keys.ENTER),
                Click.on(FillMeetingDataPage.APPLY_CHANGE_MEETING),
                Click.on(FillMeetingDataPage.SAVE_MEETING)
        );
    }
}
