package br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.builders;

import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.Pizza;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.creams.SaltCream;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.fillings.SaltFilling;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.masses.SaltMass;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.sauces.SaltSauce;
import br.com.rafael.gof.creational_patterns.builder.ex03.interfaces.Builder;

public class SaltPizzaBuilder implements Builder {
    private Pizza saltPizza;

    public SaltPizzaBuilder() {
        reset();
    }

    @Override
    public void reset() {
        saltPizza = new Pizza();
    }

    @Override
    public void prepareMass() {
        saltPizza.setMass(new SaltMass());
    }

    @Override
    public void putCream() {
        saltPizza.setCream(new SaltCream());
    }

    @Override
    public void putFilling() {
        saltPizza.setFilling(new SaltFilling());
    }

    @Override
    public void putSauce() {
        saltPizza.setSauce(new SaltSauce());
    }

    public Pizza getResult(){
        Pizza localPizza = saltPizza;
        reset();
        return localPizza;
    }
}
