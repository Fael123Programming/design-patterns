package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_engines;

public class SportingMotorcycleEngine extends MotorcycleEngine {

    public SportingMotorcycleEngine(String brand) {
        super(brand, 1000);
    }

    @Override
    public String toString() {
        return "SportingMotorcycleEngine{" +
                "brand=" + this.getBrand() +
                "model=" + this.getModel() +
                "potency=" + this.getPotency() +
                "}";
    }
}
