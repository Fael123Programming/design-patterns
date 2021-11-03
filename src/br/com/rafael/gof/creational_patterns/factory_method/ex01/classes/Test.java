package br.com.rafael.gof.creational_patterns.factory_method.ex01.classes;

import br.com.rafael.gof.creational_patterns.factory_method.ex01.interfaces.Display;

public class Test {
    public static void main(String[] args) {
        Display dis = switch(args[0]) {
            case "1" -> new CSVFile();
            case "2" -> new XMLFile();
            case "3" -> new DBFile();
            default -> throw new IllegalArgumentException("File type not found.");
        };
        dis.load("Whatever");
        dis.formatConsistency();
        //We are creating an object dynamically based on some conditions!
        //Your code needs to use interfaces!
    }
}
