package br.com.rafael.gof.structural_patterns.decorator.ex03.tests.better_usage;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.configureDataStuff(false, true);
        app.getDataManager().writeData("Data being recorded");
        System.out.println(app.getDataManager().readData());
    }
}
