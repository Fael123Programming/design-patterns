package br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.director;

import br.com.rafael.gof.creational_patterns.builder.ex03.interfaces.Builder;

public class Director {
    public void makePizza(Builder builder) {
        builder.prepareMass();
        builder.putCream();
        builder.putFilling();
        builder.putSauce();
    }
}
