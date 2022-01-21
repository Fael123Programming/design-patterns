package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_engines;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.engine.Engine;

public class CarEngine extends Engine {

    public CarEngine(String brand, double potency) {
        super(brand, "Car engine", potency);
    }

    @Override
    public String toString() {
        return "CarEngine{" +
                "brand=" + this.getBrand() +
                "model=" + this.getModel() +
                "potency=" + this.getPotency() +
                "}";
    }
}
