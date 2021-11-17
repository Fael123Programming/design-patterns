package br.com.rafael.gof.creational_patterns.builder.ex02.interfaces;

import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.engines.Engine;

// The builder interface specifies methods for creating the
// different parts of the product objects.
// Unlike other creation patterns, builder lets you construct
// products that don't follow the common interface.

public interface Builder {
    void reset();

    void setSeats(int quantity);

    void setEngine(Engine engine);

    void setTripComputer();

    void setGPS();
}
