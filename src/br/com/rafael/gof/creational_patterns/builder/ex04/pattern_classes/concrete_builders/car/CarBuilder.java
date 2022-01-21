package br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.concrete_builders.car;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.Car;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_engines.CarEngine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_tires.CarTire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_wheels.CarWheel;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.manual.Manual;
import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.abstract_builder.Builder;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void constructSteelStructure() {
        this.car = new Car();
        this.car.setBrand("Super Cars");
        this.car.setModel("Conventional");
    }

    @Override
    public void paint(String color) {
        this.car.setColor(color);
    }

    @Override
    public void installWheels() {
        CarWheel[] wheels = {new CarWheel("Super Car Wheels", 16),
                new CarWheel("Super Car Wheels", 16)};
        this.car.setWheels(wheels);
    }

    @Override
    public void installTires() {
        CarTire[] tires = {new CarTire("Super Car Tires", 16),
                new CarTire("Super Car Tires", 16)};
        this.car.setTires(tires);
    }

    @Override
    public void installEngine() {
        this.car.setEngine(new CarEngine("Super Car Engines", 800));
    }

    @Override
    public void createManual() {
        this.car.setManual(new Manual("Information about this car usage"));
    }

    public Car getResult() {
        return this.car;
    }
}
