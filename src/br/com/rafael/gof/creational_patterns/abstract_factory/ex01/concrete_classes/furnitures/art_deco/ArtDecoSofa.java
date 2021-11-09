package br.com.rafael.gof.creational_patterns.abstract_factory.ex01.concrete_classes.furnitures.art_deco;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex01.interfaces.furnitures.Sofa;

public class ArtDecoSofa implements Sofa {
    public String getInfo(){
        return "An art deco sofa...";
    }
}
