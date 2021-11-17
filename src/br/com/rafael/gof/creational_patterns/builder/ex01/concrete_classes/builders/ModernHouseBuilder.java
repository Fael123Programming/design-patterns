package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.builders;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses.ModernHouse;
import br.com.rafael.gof.creational_patterns.builder.ex01.interfaces.Builder;

import java.util.ArrayList;

public class ModernHouseBuilder implements Builder {
    private ModernHouse house;

    public ModernHouseBuilder() {
        reset();
    }

    @Override
    public void reset() {
        house = new ModernHouse();
        house.getHouse().setRooms(new ArrayList<>());
    }

    @Override
    public void buildStep1() {
        house.getHouse().setFloor(new Floor(FloorType.LAMINATE, Color.WHITE));
        for (int i = 0; i < 5; i++)
            house.getHouse().getRooms().add(new Room(Color.GREEN, 1, 3));
    }

    @Override
    public void buildStep2() {
        house.getHouse().setRoof(new Roof(RoofType.ASPHALT_SHINGLES, Color.SILVER, 250));
        house.setGarden(new Garden(GardenType.BUTTERFLY_GARDEN));
    }

    @Override
    public void buildStep3() {
        house.getHouse().setExternalColor(Color.BLUE);
    }

    public ModernHouse getResult(){
        ModernHouse localHouse = house;
        reset();
        return localHouse;
    }
}
