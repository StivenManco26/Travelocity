package com.devco.certification.travelocity.models;

/**
 * Clase modelo para los parametros recibidos para la busqueda de servicios de transporte en Travelocity
 *
 * @author manco.5@hotmail.com
 */

public class SearchCarsModel {
    private String airport;
    private String hotel;
    private String flightArrivalDate;

    public SearchCarsModel(String airport, String hotel, String flightArrivalDate) {
        this.setAirport(airport);
        this.setHotel(hotel);
        this.setFlightArrivalDate(flightArrivalDate);
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getFlightArrivalDate() {
        return flightArrivalDate;
    }

    public void setFlightArrivalDate(String flightArrivalDate) {
        this.flightArrivalDate = flightArrivalDate;
    }
}
