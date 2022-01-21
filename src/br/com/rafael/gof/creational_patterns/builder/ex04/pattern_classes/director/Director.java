package br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.director;

import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.abstract_builder.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void createVehicle(String color) {
        this.builder.constructSteelStructure();
        this.builder.paint(color);
        this.builder.installWheels();
        this.builder.installTires();
        this.builder.installEngine();
        this.builder.createManual();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
