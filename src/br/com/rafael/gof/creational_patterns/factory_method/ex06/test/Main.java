package br.com.rafael.gof.creational_patterns.factory_method.ex06.test;

import br.com.rafael.gof.creational_patterns.factory_method.ex06.abstract_.PersonFactory;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.factories.*;

public class Main {
    public static void main(String[] args) {
        PersonFactory factory = new WomanFactory();
        System.out.println(factory.createPerson().getInfo());
        factory = new ManFactory();
        System.out.println(factory.createPerson().getInfo());
    }
}
