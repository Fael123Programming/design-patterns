package br.com.rafael.gof.structural_patterns.composite.ex02;

import br.com.rafael.gof.structural_patterns.composite.ex02.composite.CompoundGraphic;
import br.com.rafael.gof.structural_patterns.composite.ex02.leaves.*;

public class Main {
    public static void main(String[] args) {
        CompoundGraphic compoundGraphic = new CompoundGraphic();
        compoundGraphic.insert(new Dot(1.5, 3.4));
        compoundGraphic.insert(new Dot(3, 8.9));
        compoundGraphic.insert(new Circle(8, 5, 4.5));
        CompoundGraphic compoundGraphic2 = new CompoundGraphic();
        compoundGraphic2.insert(new Circle(10, 12, 10));
        compoundGraphic2.insert(new Dot(100, 200));
        compoundGraphic.insert(compoundGraphic2);
        System.out.print(compoundGraphic.draw());
        compoundGraphic.move(10, 10); //Move all nested components 10 units forward.
        System.out.print(compoundGraphic.draw());
    }
}
