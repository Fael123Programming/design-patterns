package br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.abstract_builder;

public interface Builder {
    void constructSteelStructure();
    void paint(String color);
    void installWheels();
    void installTires();
    void installEngine();
    void createManual();
}
