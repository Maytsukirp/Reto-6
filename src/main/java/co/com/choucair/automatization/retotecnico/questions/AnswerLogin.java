package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.StartData;
import co.com.choucair.automatization.retotecnico.userinterface.IconNewMeeting;
import co.com.choucair.automatization.retotecnico.userinterface.LoginInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class AnswerLogin implements Question<Boolean> {
    String message_login;

    public AnswerLogin(String message) {
        this.message_login = message;
    }

    public static AnswerLogin theD(String message) {

        return new AnswerLogin (message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String text_login = "StartSharp";

        if(text_login.equals(message_login)){
            result = true;
        }else{
            result = false;

        }
        return result;
    }
}
