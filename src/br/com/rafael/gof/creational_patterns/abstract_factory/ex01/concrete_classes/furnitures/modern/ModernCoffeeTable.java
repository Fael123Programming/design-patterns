package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.modern;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    public String getInfo(){
        return "A modern coffee table...";
    }
}
