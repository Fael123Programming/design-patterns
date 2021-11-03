package br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.concrete_creators;

import br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.concrete_products.ConcreteProductA;
import br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.abstract_.Creator;

public class ConcreteCreatorA extends Creator {

    @Override
    public ConcreteProductA createProduct(){
        return new ConcreteProductA();
    }
}
