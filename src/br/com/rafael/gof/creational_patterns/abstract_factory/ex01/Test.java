package br.com.rafael.gof.creational_patterns.abstract_factory.ex01;

//Usually, the application creates a concrete factory object at the initialization stage.
//Just before that, the app must select the factory type depending on the configuration or the environment settings.

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.factories.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furniture_factory.FurnitureFactory;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.*;

public class Test {
    public static void main(String[] args) {
        //Reference variables from interfaces.
        //They generalize and abstract the system's object classification.
        //It makes easier the process of adding new types of objects on the system's scope.
        FurnitureFactory factory;
        Chair chair;
        Sofa sofa;
        CoffeeTable coffeeTable;
        //-----------------------------------------------------------------------------------------
        factory = new VictorianFurnitureFactory(); //Creating a concrete factory object.
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
        System.out.println(chair.getInfo());
        System.out.println(sofa.getInfo());
        System.out.println(coffeeTable.getInfo());
        //-----------------------------------------------------------------------------------------
        factory = new ModernFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
        System.out.println(chair.getInfo());
        System.out.println(sofa.getInfo());
        System.out.println(coffeeTable.getInfo());
        //-----------------------------------------------------------------------------------------
        factory = new ArtDecoFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
        System.out.println(chair.getInfo());
        System.out.println(sofa.getInfo());
        System.out.println(coffeeTable.getInfo());
    }
}
