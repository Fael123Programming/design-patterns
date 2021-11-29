package br.com.rafael.gof.structural_patterns.bridge.ex01.classes.concrete.shapes;

import br.com.rafael.gof.structural_patterns.bridge.ex01.classes.abstract_.*;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }
}
