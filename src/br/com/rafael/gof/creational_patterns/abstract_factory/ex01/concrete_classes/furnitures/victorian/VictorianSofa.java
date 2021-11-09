package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.victorian;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.Sofa;

public class VictorianSofa implements Sofa {
    public String getInfo(){
        return "A victorian sofa...";
    }
}
