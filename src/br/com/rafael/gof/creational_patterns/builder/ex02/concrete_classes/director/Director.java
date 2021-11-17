package br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.director;

import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.engines.*;
import br.com.rafael.gof.creational_patterns.builder.ex02.interfaces.Builder;

// The director is only responsible for executing the building
// steps in a particular sequence. It's helpful when producing
// products according to a specific order or configuration.
// Strictly speaking, the director class is optional, since the
// client can control builders directly.

public class Director {

    // The director works with any builder instance that the
    // client code passes to it. This way, the client code may
    // alter the final type of the newly assembled product.
    // The director can construct several product variations
    // using the same building steps.

    public void makeSUV(Builder builder) {
        builder.setEngine(new SUVEngine());
        builder.setGPS();
        builder.setSeats(5);
        builder.setTripComputer();
    }

    public void makeSportCar(Builder builder) {
        builder.setEngine(new SportCarEngine());
        builder.setGPS();
        builder.setSeats(2);
        builder.setTripComputer();
    }
}
