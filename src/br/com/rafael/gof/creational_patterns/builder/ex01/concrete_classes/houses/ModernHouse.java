package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.Floor;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.Garden;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.Roof;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;

public class ModernHouse {
    private House house;
    private Garden garden;

    public ModernHouse(Roof roof, Floor floor, Color externalColor, Garden garden) {
        this.house = new House(roof, floor, externalColor);
        this.garden = garden;
    }

    public ModernHouse() {
        house = new House();
    }

    public House getHouse() {
        return house;
    }

    public Garden getGarden() {
        return garden;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public String toString() {
        return "ModernHouse{" +
                "house=" + house +
                ", garden=" + garden +
                '}';
    }
}
