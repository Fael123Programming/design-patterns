package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furniture_factory;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.*;

//A main interface which declares methods that return abstract objects. These objects are indeed, another interfaces
//that have their concrete implementation. We do not want to create a unique type of abstract object to be
// created (like factory method) but a large number of them.
//This main interface is nothing but the abstract factory used in this example!

public interface FurnitureFactory {
    Chair createChair(); //public and abstract by definition!
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
