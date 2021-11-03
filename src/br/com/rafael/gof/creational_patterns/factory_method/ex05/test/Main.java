package br.com.rafael.gof.creational_patterns.factory_method.ex05.test;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.initialize();
        app.getDialog().render();
    }
}
