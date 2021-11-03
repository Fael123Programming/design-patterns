package br.com.rafael.gof.creational_patterns.factory_method.ex01.classes;

import br.com.rafael.gof.creational_patterns.factory_method.ex01.interfaces.Display;

public class CSVFile implements Display {
    @Override
    public void load(String textFile) {
        System.out.println("Load from a txt file.");
    }

    @Override
    public void formatConsistency(){
        System.out.println("Txt file format changed.");
    }
}
