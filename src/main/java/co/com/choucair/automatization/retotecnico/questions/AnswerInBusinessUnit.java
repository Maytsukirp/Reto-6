package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.StartSharpData;
import co.com.choucair.automatization.retotecnico.userinterface.FillBusinessUnitDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class AnswerInBusinessUnit implements Question<Boolean> {
    private List<StartSharpData> data;

    public AnswerInBusinessUnit(List<StartSharpData> data) {

        this.data = data;
    }

    public static AnswerInBusinessUnit forTheCreatedBusinessUnit(List<StartSharpData> data) {

        return new AnswerInBusinessUnit(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(FillBusinessUnitDataPage.TEXT_SEARCH_BUSINESS), Enter.theValue(data.get(0).getStrNameNewBusinessUnit()).into(FillBusinessUnitDataPage.TEXT_SEARCH_BUSINESS));
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text_business_unit = Text.of(FillBusinessUnitDataPage.TEXT_TABLE_BUSINESS).viewedBy(actor).asString();
        return data.get(0).getStrNameNewBusinessUnit().equals(text_business_unit);
    }
}