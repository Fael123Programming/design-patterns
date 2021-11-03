package br.com.rafael.gof.creational_patterns.factory_method.ex04.classes.abstract_;

import br.com.rafael.gof.creational_patterns.factory_method.ex04.interfaces.Product;

public abstract class Creator {

    public void someOperation(){
        System.out.println("Creator is doing something else...");
    }

    public abstract Product createProduct();
    //This is the factory method of this example.
    //Its behaviour and return changes according to the subclass of Creator.
}
