package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.modern.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furniture_factory.FurnitureFactory;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.*;

public class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair(){
        //All business and design logic to create a modern chair...
        return new ModernChair();
    }

    public Sofa createSofa(){
        //All business and design logic to create a modern sofa...
        return new ModernSofa();
    }

    public CoffeeTable createCoffeeTable(){
        //All business and design logic to create a modern coffee table...
        return new ModernCoffeeTable();
    }
}
