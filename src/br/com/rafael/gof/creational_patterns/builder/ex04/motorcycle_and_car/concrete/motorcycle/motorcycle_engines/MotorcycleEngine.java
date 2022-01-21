package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_engines;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.engine.Engine;

public class MotorcycleEngine extends Engine {

    public MotorcycleEngine(String brand, double potency) {
        super(brand, "Motorcycle engine", potency);
    }

    @Override
    public String toString() {
        return "MotorcycleEngine{" +
                "brand=" + this.getBrand() +
                "model=" + this.getModel() +
                "potency=" + this.getPotency() +
                "}";
    }
}
