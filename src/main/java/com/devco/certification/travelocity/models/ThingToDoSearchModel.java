package com.devco.certification.travelocity.models;

/**
 * Clase modelo para los parametros recibidos para la busqueda de
 * Cosas para hacer en Travelocity
 *
 * @author manco.5@hotmail.com
 */
public class ThingToDoSearchModel {
    private String location;
    private String from;
    private String to;

    public ThingToDoSearchModel(String location, String from, String to) {
        this.setLocation(location);
        this.setFrom(from);
        this.setTo(to);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
