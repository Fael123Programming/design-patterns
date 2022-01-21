package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_engines;

public class SportingCarEngine extends CarEngine {

    public SportingCarEngine(String brand) {
        super(brand, 2000);
    }

    @Override
    public String toString() {
        return "SportingCarEngine{" +
                "brand=" + this.getBrand() +
                "model=" + this.getModel() +
                "potency=" + this.getPotency() +
                "}";
    }
}
