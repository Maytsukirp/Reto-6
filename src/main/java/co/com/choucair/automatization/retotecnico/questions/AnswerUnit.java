package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewBusinessUnit;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class AnswerUnit implements Question<Boolean> {
    private List<StartData> data;

    public AnswerUnit(List<StartData> data) {

        this.data = data;
    }

    public static AnswerUnit theD(List<StartData> data) {

        return new AnswerUnit(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(IconNewBusinessUnit.TEXT_SEARCH_BUSINESS), Enter.theValue(data.get(0).getStrNameNewBusinessUnit()).into(IconNewBusinessUnit.TEXT_SEARCH_BUSINESS));
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text_business_unit = Text.of(IconNewBusinessUnit.TEXT_TABLE_BUSINESS).viewedBy(actor).asString();
        return data.get(0).getStrNameNewBusinessUnit().equals(text_business_unit);
    }
}