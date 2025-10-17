package com.antoninrgb.labintrojpawithspringlocal.model;

import jakarta.persistence.*;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String flight_n;

    private String aircraft;

    private int seats;

    private int mileage;

    public Flight(String flight_n, String aircraft, int seats, int mileage) {
        this.flight_n = flight_n;
        this.aircraft = aircraft;
        this.seats = seats;
        this.mileage = mileage;
    }

    public Flight() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlight_n() {
        return flight_n;
    }

    public void setFlight_n(String flight_n) {
        this.flight_n = flight_n;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
