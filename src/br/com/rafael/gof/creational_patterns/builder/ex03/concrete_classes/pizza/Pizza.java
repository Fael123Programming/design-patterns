package br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza;

import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.fillings.Filling;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.masses.Mass;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.creams.Cream;
import br.com.rafael.gof.creational_patterns.builder.ex03.concrete_classes.pizza.sauces.Sauce;

public class Pizza {
    private Mass mass;
    private Cream cream;
    private Sauce sauce;
    private Filling filling;

    //We do not need a wide constructor to create a more complex object at all!!!!
    //Only the default one and set methods are sufficient for us.

    public Mass getMass() {
        return mass;
    }

    public void setMass(Mass mass) {
        this.mass = mass;
    }

    public Cream getCream() {
        return cream;
    }

    public void setCream(Cream cream) {
        this.cream = cream;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "mass=" + mass +
                ", cream=" + cream +
                ", sauce=" + sauce +
                ", filling=" + filling +
                '}';
    }
}
