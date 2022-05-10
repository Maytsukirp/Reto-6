package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewBusinessUnit;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer2 implements Question<Boolean> {
    String message;

    public Answer2(String message) {
        this.message = message;
    }

    public static Answer2 theD(String message) {

        return new Answer2 (message);
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
