package br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.builders;

import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.Car;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.engines.Engine;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.others.GPS;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.others.TripComputer;
import br.com.rafael.gof.creational_patterns.builder.ex02.interfaces.Builder;

// The concrete builder classes follow the builder interface and
// provide specific implementations of the building steps. Your
// program may have several variations of builders, each
// implemented differently.

public class CarBuilder implements Builder {
    public Car car;

    public CarBuilder() {
        reset();
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int quantity) {
        car.setSeats(quantity);
    }

    @Override
    public void setEngine(Engine newEngine) {
        car.setEngine(newEngine);
    }

    @Override
    public void setTripComputer() {
        car.setTripComp(new TripComputer());
    }

    @Override
    public void setGPS() {
        car.setGps(new GPS());
    }

    // Concrete builders are supposed to provide their own
    // methods for retrieving results. That's because various
    // types of builders may create entirely different products
    // that don't all follow the same interface. Therefore, such
    // methods can't be declared in the builder interface (at
    // least not in a statically-typed programming language).

    public Car getResult() {
        Car result = car;
        reset();
        return result;
    }

}
