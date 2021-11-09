package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.art_deco;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.Chair;

public class ArtDecoChair implements Chair {
    public String getInfo(){
        return "An art deco chair!";
    }
}
