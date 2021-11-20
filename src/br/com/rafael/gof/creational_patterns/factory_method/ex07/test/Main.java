package br.com.rafael.gof.creational_patterns.factory_method.ex07.test;

import br.com.rafael.gof.creational_patterns.factory_method.ex07.concrete_factories.*;
import br.com.rafael.gof.creational_patterns.factory_method.ex07.interfaces.CarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new BMWFactory();
        System.out.println(factory.createCar().getInfo());
        factory = new VolkswagenFactory();
        System.out.println(factory.createCar().getInfo());
        factory = new ChevroletFactory();
        System.out.println(factory.createCar().getInfo());
    }
}
