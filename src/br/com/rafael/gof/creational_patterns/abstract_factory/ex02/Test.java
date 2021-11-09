package br.com.rafael.gof.creational_patterns.abstract_factory.ex02;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.application.Application;

public class Test {
    public static void main(String[] args) {
        Application app = new Application();
        app.launch(); //Windows 10
        System.out.println("---------------------------------------------------------------------");
        app.setOS("Linux");
        app.launch();
        System.out.println("---------------------------------------------------------------------");
        app.setOS("macOS");
        app.launch();
        System.out.println("---------------------------------------------------------------------");
        app.setOS("Android");
        app.launch();
    }
}
