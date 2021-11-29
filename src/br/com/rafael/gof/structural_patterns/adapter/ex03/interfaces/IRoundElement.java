package br.com.rafael.gof.structural_patterns.adapter.ex03.interfaces;

public interface IRoundElement {
    double getRadius();

    default boolean fits(IRoundElement anotherElement) {
        return this.getRadius() >= anotherElement.getRadius();
    }

    String getDescription();
}
