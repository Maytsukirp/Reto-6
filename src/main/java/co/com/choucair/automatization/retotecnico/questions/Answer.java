package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.StartData;

import co.com.choucair.automatization.retotecnico.userinterface.IconNewMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<StartData> data;

    public Answer(List<StartData> data) {

        this.data = data;
    }

    public static Answer theD(List<StartData> data) {

        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(IconNewMeeting.TEXT_SEARCH), Enter.theValue(data.get(0).getStrMeetingName()).into(IconNewMeeting.TEXT_SEARCH));
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text_finish_meeting = Text.of(IconNewMeeting.TEXT_TABLE).viewedBy(actor).asString();
        return data.get(0).getStrMeetingName().equals(text_finish_meeting);
    }
}
