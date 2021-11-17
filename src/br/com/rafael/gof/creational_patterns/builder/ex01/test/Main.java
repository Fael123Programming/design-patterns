package br.com.rafael.gof.creational_patterns.builder.ex01.test;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.builders.*;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.director.Director;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses.HighHouse;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses.House;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses.ModernHouse;

public class Main {
    public static void main(String[] args) {
        CommonHouseBuilder cHouseBuilder = new CommonHouseBuilder();
        ModernHouseBuilder mHouseBuilder = new ModernHouseBuilder();
        HighHouseBuilder hHouseBuilder = new HighHouseBuilder();
        Director director = new Director();
        director.buildCommonHouse(cHouseBuilder);
        director.buildModernHouse(mHouseBuilder);
        director.buildHighHouse(hHouseBuilder);
        House house = cHouseBuilder.getResult();
        ModernHouse mHouse = mHouseBuilder.getResult();
        HighHouse hHouse = hHouseBuilder.getResult();
        System.out.println(house);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(mHouse);
        System.out.println("------------------------------------------------------------------------");
        System.out.println(hHouse);
        System.out.println("------------------------------------------------------------------------");

    }
}
