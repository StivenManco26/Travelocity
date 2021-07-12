package com.devco.certification.travelocity.models;

/**
 * Clase modelo para los parametros recibidos para la busqueda de estadias en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class SearchStaysModel {
    private String destination;
    private String checkIn;
    private String checkOut;

    public SearchStaysModel(String destination, String checkIn, String checkOut) {
        this.setDestination(destination);
        this.setCheckIn(checkIn);
        this.setCheckOut(checkOut);
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
}
