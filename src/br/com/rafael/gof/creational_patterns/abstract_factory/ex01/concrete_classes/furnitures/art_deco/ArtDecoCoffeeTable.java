package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.art_deco;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    public String getInfo(){
        return "An art deco coffee table...";
    }
}
