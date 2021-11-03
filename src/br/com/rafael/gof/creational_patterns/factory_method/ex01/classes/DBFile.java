package br.com.rafael.gof.creational_patterns.factory_method.ex01.classes;

import br.com.rafael.gof.creational_patterns.factory_method.ex01.interfaces.Display;

public class DBFile implements Display {
    @Override
    public void load(String dbFile) {
        System.out.println("Load from a db file.");
    }

    @Override
    public void formatConsistency(){
        System.out.println("Db file format changed.");
    }
}
