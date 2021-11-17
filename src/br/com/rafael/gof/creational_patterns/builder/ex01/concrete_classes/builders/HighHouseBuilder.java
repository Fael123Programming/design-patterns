package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.builders;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses.HighHouse;
import br.com.rafael.gof.creational_patterns.builder.ex01.interfaces.*;
import java.util.ArrayList;

public class HighHouseBuilder implements Builder {
    private HighHouse house;

    public HighHouseBuilder() {
        reset();
    }

    @Override
    public void reset() {
        house = new HighHouse();
        house.getModernHouse().getHouse().setRooms(new ArrayList<>());
    }

    @Override
    public void buildStep1() {
        house.getModernHouse().getHouse().setFloor(new Floor(FloorType.PORCELAIN, Color.WHITE));
        for (int i = 0; i < 6; i++)
            house.getModernHouse().getHouse().getRooms().add(new Room(Color.SILVER, 2, 3));
        house.getModernHouse().getHouse().setRoof(new Roof(RoofType.SOLAR_TILES, Color.GOLD, 300));
    }

    @Override
    public void buildStep2() {
        house.getModernHouse().setGarden(new Garden(GardenType.WATER_GARDEN));
        house.setPool(new Pool(PoolType.INFINITY, PoolStuff.PORCELAIN, Color.SILVER, 100, 2));
    }

    @Override
    public void buildStep3() {
        house.getModernHouse().getHouse().setExternalColor(Color.RED);
    }

    public HighHouse getResult(){
        HighHouse localHouse = house;
        reset();
        return localHouse;
    }
}
