package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.modern;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.Chair;

public class ModernChair implements Chair {
    public String getInfo(){
        return "A modern chair...";
    }
}
