package com.devco.certification.travelocity.models;

/**
 * Clase modelo para los parametros recibidos para la busqueda de vuelos en Travelocity
 *
 * @author manco.5@hotmail.com
 */

public class SearchFlightModel {
    private String origin;
    private String destination;
    private String departing;

    public SearchFlightModel(String origin, String destination, String departing) {
        this.origin = origin;
        this.destination = destination;
        this.departing = departing;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparting() {
        return departing;
    }

    public void setDeparting(String departing) {
        this.departing = departing;
    }
}
