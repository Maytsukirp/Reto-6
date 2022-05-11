package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class AnswerUnit implements Question<Boolean> {
    String message;

    public AnswerUnit(String message) {
        this.message = message;
    }

    public static AnswerUnit theD(String message) {

        return new AnswerUnit (message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String text_finish_business = "Business Units";

        if(text_finish_business.equals(message)){
            result = true;
        }else{
            result = false;

        }
        return result;
    }
}