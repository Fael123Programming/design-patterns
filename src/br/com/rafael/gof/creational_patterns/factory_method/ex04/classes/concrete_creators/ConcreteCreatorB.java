package br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.concrete_creators;

import br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.concrete_products.ConcreteProductB;
import br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.abstract_.Creator;

public class ConcreteCreatorB extends Creator {

    @Override
    public ConcreteProductB createProduct(){
        return new ConcreteProductB();
    }
}
