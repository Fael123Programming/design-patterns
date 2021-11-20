package br.com.rafael.gof.creational_patterns.factory_method.ex07.interfaces;

public interface CarFactory {
    ICar createCar();
    //Factory method has only one main method at the abstract factory.
    //This method is implemented differently by multiple concrete
    //factories which can themselves return different objects. Of course,
    //these factories must create objects of the same base: the abstract
    //main object. In this case, an ICar.
    //ICar may refer a BMWCar, ChevroletCar or a VolkswagenCar.
    //For each concrete car we have a concrete factory!!!
}
