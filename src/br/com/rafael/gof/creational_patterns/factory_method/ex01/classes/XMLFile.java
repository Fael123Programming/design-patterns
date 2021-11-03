package br.com.rafael.gof.creational_patterns.factory_method.ex01.classes;

import br.com.rafael.gof.creational_patterns.factory_method.ex01.interfaces.Display;

public class XMLFile implements Display {
    @Override
    public void load(String xmlFile) {
        System.out.println("Load from a XML file.");
    }

    @Override
    public void formatConsistency(){
        System.out.println("XML file format changed.");
    }
}
