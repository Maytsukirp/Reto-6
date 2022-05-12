package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.StartData;

import co.com.choucair.automatization.retotecnico.userinterface.FillNewMeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerMeeting implements Question<Boolean> {

    private List<StartData> data;

    public AnswerMeeting(List<StartData> data) {

        this.data = data;
    }

    public static AnswerMeeting theD(List<StartData> data) {

        return new AnswerMeeting(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(FillNewMeetingPage.TEXT_SEARCH), Enter.theValue(data.get(0).getStrMeetingName()).into(FillNewMeetingPage.TEXT_SEARCH));
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text_finish_meeting = Text.of(FillNewMeetingPage.TEXT_TABLE).viewedBy(actor).asString();
        return data.get(0).getStrMeetingName().equals(text_finish_meeting);
    }
}
