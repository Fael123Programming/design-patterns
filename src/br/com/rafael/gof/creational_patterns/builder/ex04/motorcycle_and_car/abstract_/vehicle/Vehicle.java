package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.vehicle;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.engine.Engine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.tire.Tire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.wheel.Wheel;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.manual.Manual;
import java.util.Arrays;

public abstract class Vehicle {
    private Manual manual;
    private String brand, model, color;
    protected Engine engine;
    protected Wheel[] wheels;
    protected Tire[] tires;

    public Vehicle(Manual manual, String brand, String model, String color) {
        this.manual = manual;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Vehicle() {}

    public Manual getManual() {
        return this.manual;
    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public abstract void setEngine(Engine engine);

    public Wheel[] getWheels() {
        return this.wheels;
    }

    public abstract void setWheels(Wheel[] wheels);

    public Tire[] getTires() {
        return this.tires;
    }

    public abstract void setTires(Tire[] tires);

    @Override
    public String toString() {
        return "Vehicle{" +
                "manual=" + manual +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", tires=" + Arrays.toString(tires) +
                '}';
    }
}
