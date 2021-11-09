package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.victorian;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    public String getInfo(){
        return "A victorian coffee table...";
    }
}
