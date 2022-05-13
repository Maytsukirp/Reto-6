package co.com.choucair.automatization.retotecnico.questions;
import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.userinterface.FillMeetingDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerInMeeting implements Question<Boolean> {

    private List<StartSharpData> data;

    public AnswerInMeeting(List<StartSharpData> data) {

        this.data = data;
    }

    public static AnswerInMeeting forTheCreatedMeeting(List<StartSharpData> data) {

        return new AnswerInMeeting(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(FillMeetingDataPage.TEXT_SEARCH), Enter.theValue(data.get(0).getStrMeetingName()).into(FillMeetingDataPage.TEXT_SEARCH));
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text_finish_meeting = Text.of(FillMeetingDataPage.TEXT_TABLE).viewedBy(actor).asString();
        return data.get(0).getStrMeetingName().equals(text_finish_meeting);
    }
}
