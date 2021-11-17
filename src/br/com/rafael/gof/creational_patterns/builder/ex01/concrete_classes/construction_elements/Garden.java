package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.GardenType;

public class Garden {
    private GardenType type;

    public Garden(GardenType type) {
        this.type = type;
    }

    public GardenType getType() {
        return type;
    }

    public void setType(GardenType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Garden{" +
                "type=" + type +
                '}';
    }
}
