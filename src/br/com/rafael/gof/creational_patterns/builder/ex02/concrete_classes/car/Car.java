package br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car;

import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.engines.Engine;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.others.*;

public class Car {
    private int seats;
    private Engine engine;
    private GPS gps;
    private TripComputer tripComp;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public TripComputer getTripComp() {
        return tripComp;
    }

    public void setTripComp(TripComputer tripComp) {
        this.tripComp = tripComp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", gps=" + gps +
                ", tripComp=" + tripComp +
                '}';
    }
}
