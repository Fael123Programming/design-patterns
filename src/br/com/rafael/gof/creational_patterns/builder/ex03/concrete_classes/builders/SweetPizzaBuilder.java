package br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.builders;

import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.Pizza;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.creams.SweetCream;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.fillings.SweetFilling;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.masses.SweetMass;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.sauces.SweetSauce;
import br.com.rafael.gof.creational_patterns.builder.ex03.interfaces.Builder;

public class SweetPizzaBuilder implements Builder {
    private Pizza sweetPizza;

    public SweetPizzaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        sweetPizza = new Pizza();
    }

    @Override
    public void prepareMass() {
        sweetPizza.setMass(new SweetMass());
    }

    @Override
    public void putFilling() {
        sweetPizza.setFilling(new SweetFilling());
    }

    @Override
    public void putCream() {
        sweetPizza.setCream(new SweetCream());
    }

    @Override
    public void putSauce() {
        sweetPizza.setSauce(new SweetSauce());
    }

    public Pizza getResult(){
        Pizza localPizza = sweetPizza;
        reset();
        return localPizza;
    }
}
