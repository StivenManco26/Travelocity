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
    // modelo de persona con credenciales (userName y password)
    private UserModel userModel;

    // constructor de la tarea
    public EnterThe(UserModel userModel) {
        this.userModel = userModel;
    }

    // Desarrollo de la tarea
    @Override
    @Step("{0} Enter the credentials")
    public <T extends Actor> void performAs(T actor) {
        // Ingresa el userName de la persona en el campo EMAIL_TEXTBOX
        actor.attemptsTo(Enter.theValue(userModel.getUsername()).into(SignInPage.EMAIL_TEXTBOX),
                // Ingresa el password de la persona en el campo PASSWORD_TEXTBOX
                Enter.theValue(userModel.getPassword()).into(SignInPage.PASSWORD_TEXTBOX),
                // El actor le da click al boton SIGN_IN_BUTTON
                Click.on(SignInPage.SUBMIT_BUTTON));
    }

    // metodo que llama al instrumented que crea una instancia en tiempo de
    // ejecución, con el parametro de tipo PersonaModel
    public static EnterThe credentials(UserModel userModel) {
        return instrumented(EnterThe.class, userModel);
    }

    //Metodo que retorna el mensaje de error, cuando el registro no fue exitoso
    public String getUnableToLoginMessage() {
        return String.format(UnableToLogin.getUnableToLoginMessage());
    }
}
