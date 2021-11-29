package br.com.rafael.gof.structural_patterns.bridge.ex01.classes.concrete.shapes;

import br.com.rafael.gof.structural_patterns.bridge.ex01.classes.abstract_.Color;
import br.com.rafael.gof.structural_patterns.bridge.ex01.classes.abstract_.Shape;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }
}
