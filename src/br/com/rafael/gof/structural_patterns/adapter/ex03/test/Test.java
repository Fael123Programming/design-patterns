package br.com.rafael.gof.structural_patterns.adapter.ex03.test;

import br.com.rafael.gof.structural_patterns.adapter.ex03.concrete_classes.adapter.SquarePegAdapter;
import br.com.rafael.gof.structural_patterns.adapter.ex03.concrete_classes.other.*;
import br.com.rafael.gof.structural_patterns.adapter.ex03.interfaces.IRoundElement;

public class Test {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(10, 100);
        SquarePeg squarePeg = new SquarePeg(10, 100);
        SquarePegAdapter squareAdapter = new SquarePegAdapter(squarePeg);
        businessLogic(hole, roundPeg);
        businessLogic(squareAdapter, roundPeg);
        businessLogic(squareAdapter, hole);
    }

    private static void businessLogic(IRoundElement element, IRoundElement anotherElement) {
        System.out.println("First element: " + element.getDescription());
        System.out.println("Second element: " + anotherElement.getDescription());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("First element has radius " + element.getRadius());
        System.out.println("Second element has radius " + anotherElement.getRadius());
        if (element.fits(anotherElement))
            System.out.println("First fits the second");
        if (anotherElement.fits(element))
            System.out.println("Second fits the first");
        System.out.println("--------------------------------------------------------------------------------");
    }
}
