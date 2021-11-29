package br.com.rafael.gof.structural_patterns.bridge.ex01.test;

//If you need to tie up two class hierarchies and do not want to create lots of new classes
//making inheritance you can use this pattern. Here object composition is used as a bridge
// between different class families.
//Bridge can be used to multiplatform an application.
//Two dimensions of classes: A and B.
//Example: GUI A to OP Windows, GUI A to OP Linux, GUI A to OP MAC etc.
//Different implementations are interchangeable as long as they follow a common interface.

import br.com.rafael.gof.structural_patterns.bridge.ex01.classes.concrete.colors.*;
import br.com.rafael.gof.structural_patterns.bridge.ex01.classes.concrete.shapes.*;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(new Blue());
        Triangle triangle = new Triangle(new Green());
//        Instead of having to create classes such as BlueCircle or GreenTriangle using inheritance
//        we use abstractions (in this case, Shape and Color) and different implementations (Circle,
//        Green and furthermore) to solve our problem.

    }
}
