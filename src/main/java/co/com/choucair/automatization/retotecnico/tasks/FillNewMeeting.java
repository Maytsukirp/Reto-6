package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.FillNewMeetingPage;
import net.serenitybdd.screenplay.Actor;
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
                Click.on(FillNewMeetingPage.NEW_MEETING),
                Enter.theValue(data.get(0).getStrMeetingName()).into(FillNewMeetingPage.MEETING_NAME),
                Click.on(FillNewMeetingPage.CONTAINER_MEETING_TYPE),
                Enter.theValue(data.get(0).getStrMeetingType()).into(FillNewMeetingPage.MEETING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue(data.get(0).getStrMeetingNumber()).into(FillNewMeetingPage.MEETING_NUMBER),
                Enter.theValue(data.get(0).getStrStarDate()).into(FillNewMeetingPage.START_DATE),

                SelectFromOptions.byVisibleText(data.get(0).getStrStarDateHour()).from((FillNewMeetingPage.START_DATE_HOUR)),

                Enter.theValue(data.get(0).getStrEndDate()).into(FillNewMeetingPage.END_DATE),

                SelectFromOptions.byVisibleText(data.get(0).getStrEndDateHour()).from(FillNewMeetingPage.END_DATE_HOUR),

                Click.on(FillNewMeetingPage.CONTAINER_LOCATION),
                Enter.theValue(data.get(0).getStrLocation()).into(FillNewMeetingPage.LOCATION).thenHit(Keys.ENTER),
                Click.on(FillNewMeetingPage.CONTAINER_UNIT),
                Enter.theValue(data.get(0).getStrUnit()).into(FillNewMeetingPage.UNIT).thenHit(Keys.ENTER),
                Click.on(FillNewMeetingPage.CONTAINER_ORGANIZED),
                Enter.theValue(data.get(0).getStrOrganized()).into(FillNewMeetingPage.ORGANIZED).thenHit(Keys.ENTER),
                Click.on(FillNewMeetingPage.CONTAINER_REPORTER),
                Enter.theValue(data.get(0).getStrReporter()).into(FillNewMeetingPage.REPORTER).thenHit(Keys.ENTER),
                Click.on(FillNewMeetingPage.CONTAINER_ATTENDEE),
                Enter.theValue(data.get(0).getStrAttendee()).into(FillNewMeetingPage.ATTENDEE_LIST).thenHit(Keys.ENTER),

                Click.on(FillNewMeetingPage.APPLY_CHANGE_MEETING),
                Click.on(FillNewMeetingPage.SAVE_MEETING)
        );
    }
}
