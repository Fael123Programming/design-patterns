package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.engine;

public abstract class Engine {
    private String brand, model;
    private double potency;

    public Engine(String brand, String model, double potency) {
        this.brand = brand;
        this.model = model;
        this.potency = potency;
    }

    public Engine() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPotency() {
        return potency;
    }

    public void setPotency(double potency) {
        this.potency = potency;
    }
}
