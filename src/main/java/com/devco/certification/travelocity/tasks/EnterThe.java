package com.devco.certification.travelocity.tasks;

import com.devco.certification.travelocity.exeptions.UnableToLogin;
import com.devco.certification.travelocity.models.UserModel;
import com.devco.certification.travelocity.userinterfaces.SignInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Clase Task (tarea) para realizar el ingreso de las credenciales necesarias en
 * el login
 *
 * @author manco.5@hotmail.com
 */


public class EnterThe implements Task {
    private UserModel userModel;

    public EnterThe(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    @Step("{0} Enter the credentials")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userModel.getUsername()).into(SignInPage.EMAIL_TEXTBOX),
                Enter.theValue(userModel.getPassword()).into(SignInPage.PASSWORD_TEXTBOX),
                Click.on(SignInPage.SUBMIT_BUTTON));
    }

    public static EnterThe credentials(UserModel userModel) {
        return instrumented(EnterThe.class, userModel);
    }

    public String getUnableToLoginMessage() {
        return String.format(UnableToLogin.getUnableToLoginMessage());
    }
}
