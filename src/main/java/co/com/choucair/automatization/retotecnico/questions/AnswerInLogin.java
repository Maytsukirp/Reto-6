package co.com.choucair.automatization.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerInLogin implements Question<Boolean> {
    String message_login;

    public AnswerInLogin(String message) {

        this.message_login = message;
    }

    public static AnswerInLogin withTheWebsiteTitle(String message) {

        return new AnswerInLogin(message);
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
