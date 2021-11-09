package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furniture_factory.FurnitureFactory;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.victorian.*;

public class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair(){
        //All business and design logic to create a victorian chair...
        return new VictorianChair();
    }

    public Sofa createSofa(){
        //All business and design logic to create a victorian sofa...
        return new VictorianSofa();
    }

    public CoffeeTable createCoffeeTable(){
        //All business and design logic to create a victorian coffee table...
        return new VictorianCoffeeTable();
    }
}
