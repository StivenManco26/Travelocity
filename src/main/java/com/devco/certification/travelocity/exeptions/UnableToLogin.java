package com.devco.certification.travelocity.exeptions;

//Excepcion para controlar error al realizar login

public class UnableToLogin extends AssertionError{

    private static final long serialVersionUID = 1L;
    private static final String UNABLE_TO_LOGIN = "Unable to login";
    public static String getUnableToLoginMessage() {
        return UNABLE_TO_LOGIN;
    }

    public UnableToLogin(String message, Throwable cause) {
        super(message, cause);
    }
}
