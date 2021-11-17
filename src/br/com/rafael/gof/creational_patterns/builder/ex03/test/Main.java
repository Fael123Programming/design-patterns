package br.com.rafael.gof.creational_patterns.builder.ex03.test;

import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.builders.SaltPizzaBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.builders.SweetPizzaBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.director.Director;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        SaltPizzaBuilder saltPizzaBuilder = new SaltPizzaBuilder();
        SweetPizzaBuilder sweetPizzaBuilder = new SweetPizzaBuilder();
        Director director = new Director();
        director.makePizza(saltPizzaBuilder);
        Pizza saltPizza = saltPizzaBuilder.getResult();
        System.out.println(saltPizza);
        director.makePizza(sweetPizzaBuilder);
        Pizza sweetPizza = sweetPizzaBuilder.getResult();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println(sweetPizza);
    }
}
