package br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.concrete_builders.car;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.Car;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_engines.SportingCarEngine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_tires.SportingCarTire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_wheels.SportingCarWheel;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.manual.Manual;
import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.abstract_builder.Builder;

public class SportingCarBuilder implements Builder {
    private Car car;

    @Override
    public void constructSteelStructure() {
        this.car = new Car();
        this.car.setBrand("Super Cars");
        this.car.setModel("Sporting");
    }

    @Override
    public void paint(String color) {
        this.car.setColor(color);
    }

    @Override
    public void installWheels() {
        SportingCarWheel[] wheels = {new SportingCarWheel("Super Car Wheels"),
                new SportingCarWheel("Super Car Wheels"), new SportingCarWheel("Super Car Wheels"),
                new SportingCarWheel("Super Car Wheels")};
        this.car.setWheels(wheels);
    }

    @Override
    public void installTires() {
        SportingCarTire[] tires = {new SportingCarTire("Super Car Tires"),
                new SportingCarTire("Super Car Tires"), new SportingCarTire("Super Car Tires"),
                new SportingCarTire("Super Car Tires")};
        this.car.setTires(tires);
    }

    @Override
    public void installEngine() {
        this.car.setEngine(new SportingCarEngine("Super Motorcycle Engines"));
    }

    @Override
    public void createManual() {
        this.car.setManual(new Manual("Information about this car usage"));
    }

    public Car getResult() {
        return this.car;
    }
}
