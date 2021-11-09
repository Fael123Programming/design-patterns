package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.art_deco.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furniture_factory.FurnitureFactory;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.*;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    public Chair createChair(){
        //All business and design logic to create an art deco chair...
        return new ArtDecoChair();
    }

    public Sofa createSofa(){
        //All business and design logic to create an art deco sofa...
        return new ArtDecoSofa();
    }

    public CoffeeTable createCoffeeTable(){
        //All business and design logic to create an art deco coffee table...
        return new ArtDecoCoffeeTable();
    }
}
