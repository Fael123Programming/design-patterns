package br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.concrete_builders.motorcycle;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.manual.Manual;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.Motorcycle;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_engines.MotorcycleEngine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_tires.MotorcycleTire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_wheels.MotorcycleWheel;
import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.abstract_builder.Builder;

public class MotorcycleBuilder implements Builder {
    private Motorcycle motorcycle;

    @Override
    public void constructSteelStructure() {
        this.motorcycle = new Motorcycle();
        this.motorcycle.setBrand("Super Motorcycles");
        this.motorcycle.setModel("Conventional");
    }

    @Override
    public void paint(String color) {
        this.motorcycle.setColor(color);
    }

    @Override
    public void installWheels() {
        MotorcycleWheel[] wheels = {new MotorcycleWheel("Super Motorcycle Wheels", 14),
                new MotorcycleWheel("Super Motorcycle Wheels", 14)};
        this.motorcycle.setWheels(wheels);
    }

    @Override
    public void installTires() {
        MotorcycleTire[] tires = {new MotorcycleTire("Super Motorcycle Tires", 14),
                new MotorcycleTire("Super Motorcycle Tires", 14)};
        this.motorcycle.setTires(tires);
    }

    @Override
    public void installEngine() {
        this.motorcycle.setEngine(new MotorcycleEngine("Super Motorcycle Engines", 500));
    }

    @Override
    public void createManual() {
        this.motorcycle.setManual(new Manual("Information about this motorcycle usage"));
    }

    public Motorcycle getResult() {
        return this.motorcycle;
    }
}
