package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.builders;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses.House;
import br.com.rafael.gof.creational_patterns.builder.ex01.interfaces.*;

import java.util.ArrayList;

public class CommonHouseBuilder implements Builder {
    private House house;

    public CommonHouseBuilder() {
        reset();
    }

    @Override
    public void reset() {
        house = new House();
        house.setRooms(new ArrayList<>());
    }

    @Override
    public void buildStep1() {
        house.setFloor(new Floor(FloorType.HARDWOOD, Color.BROWN));
    }

    @Override
    public void buildStep2() {
        for (int i = 0; i < 3; i++)
            house.getRooms().add(new Room(Color.WHITE, 1, 2));
    }

    @Override
    public void buildStep3() {
        house.setRoof(new Roof(RoofType.METAL_ROOFING, Color.BLACK, 150));
        house.setExternalColor(Color.ORANGE);
    }

    public House getResult(){
        House localHouse = house;
        reset();
        return localHouse;
    }
}
