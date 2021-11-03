package br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.concrete_products;

import br.com.rafael.gof.creational_patterns.factory_method.ex04.interfaces.Product;

public class ConcreteProductA implements Product {
    @Override
    public void doStuff(){
        System.out.println("A ConcreteProductA is doing something...");
    }
}
