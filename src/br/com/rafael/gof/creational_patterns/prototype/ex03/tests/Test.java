package br.com.rafael.gof.creational_patterns.prototype.ex03.tests;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;
import br.com.rafael.gof.creational_patterns.prototype.ex03.abstract_class.Shape;
import br.com.rafael.gof.creational_patterns.prototype.ex03.concrete_classes.*;
import java.util.*;

public class Test {
    private static final List<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        Circle circle1 = new Circle(10.5, 8.96, 4.56, Color.WHITE);
        shapes.add(circle1);
        shapes.add(circle1.cloneThis());
        shapes.add(new Rectangle(3.4, 1.1, 8, 3.4, Color.SILVER));
    }

    private List<Shape> copyAll() {
        LinkedList<Shape> copies = new LinkedList<>();
        shapes.forEach(s -> copies.addFirst(s.cloneThis()));
//        for(Shape s : shapes)
//            copies.addFirst(s.cloneThis());
        return copies;
//        We copied each element internally without knowing their real details such as their
//        class but only knowing a way to refer to them: a shape.
//        Our code does not depend on the concrete class of the objects we want to copy.
//        We can avoid subclassing that differs only at the way they initialize their objects
//        by creating pre-built prototype objects to be used just for cloning: they are passed
//        into a specific constructor.
//        Get rid of repeated initialization using pre-built objects: the prototypes.
    }
}
