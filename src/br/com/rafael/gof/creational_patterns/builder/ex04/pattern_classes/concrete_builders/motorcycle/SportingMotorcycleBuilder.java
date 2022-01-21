package br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.concrete_builders.motorcycle;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.manual.Manual;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.Motorcycle;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_engines.SportingMotorcycleEngine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_tires.SportingMotorcycleTire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_wheels.SportingMotorcycleWheel;
import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.abstract_builder.Builder;

public class SportingMotorcycleBuilder implements Builder {
    private Motorcycle motorcycle;

    @Override
    public void constructSteelStructure() {
        this.motorcycle = new Motorcycle();
        this.motorcycle.setBrand("Super Motorcycles");
        this.motorcycle.setModel("Sporting");
    }

    @Override
    public void paint(String color) {
        this.motorcycle.setColor(color);
    }

    @Override
    public void installWheels() {
        SportingMotorcycleWheel[] wheels = {new SportingMotorcycleWheel("Super Motorcycle Wheels"),
                new SportingMotorcycleWheel("Super Motorcycle Wheels")};
        this.motorcycle.setWheels(wheels);
    }

    @Override
    public void installTires() {
        SportingMotorcycleTire[] tires = {new SportingMotorcycleTire("Super Motorcycle Tires"),
                new SportingMotorcycleTire("Super Motorcycle Tires")};
        this.motorcycle.setTires(tires);
    }

    @Override
    public void installEngine() {
        this.motorcycle.setEngine(new SportingMotorcycleEngine("Super Motorcycle Engines"));
    }

    @Override
    public void createManual() {
        this.motorcycle.setManual(new Manual("Information about this motorcycle usage"));
    }

    public Motorcycle getResult() {
        return this.motorcycle;
    }
}
