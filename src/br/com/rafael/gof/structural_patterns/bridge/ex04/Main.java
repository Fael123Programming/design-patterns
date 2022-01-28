package br.com.rafael.gof.structural_patterns.bridge.ex04;

import br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions.App;
import br.com.rafael.gof.structural_patterns.bridge.ex04.app_factory.AppFactory;
import br.com.rafael.gof.structural_patterns.bridge.ex04.exceptions.UnknownOperatingSystemException;

//We have two hierarchies of classes: Apps and their GUIs!!!
//Then we can integrate them without using inheritance for each specific type but
//object composition!

public class Main {
    public static void main(String[] args) {
//        System.getProperties().list(System.out);
        try {
            App app = AppFactory.getProperApp();
            app.initialize();
        } catch(UnknownOperatingSystemException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
