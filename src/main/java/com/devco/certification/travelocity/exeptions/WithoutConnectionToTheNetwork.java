package com.devco.certification.travelocity.exeptions;

/**
 * Excepción para controlar la conexión a internet
 * @author manco.5@hotmail.com
 */

public class WithoutConnectionToTheNetwork extends AssertionError {
    private static final long serialVersionUID = 1L;
    private static final String ERROR_NETWORK_CONNECTION = "Without connection to the network";

    public static String getErrorNetworkMessage() {
        return ERROR_NETWORK_CONNECTION;
    }

    public WithoutConnectionToTheNetwork(String message, Throwable cause) {
        super(message, cause);
    }
}
