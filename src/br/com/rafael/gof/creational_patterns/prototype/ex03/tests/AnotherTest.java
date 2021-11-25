package br.com.rafael.gof.creational_patterns.prototype.ex03.tests;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;
import br.com.rafael.gof.creational_patterns.prototype.ex03.abstract_class.Shape;
import br.com.rafael.gof.creational_patterns.prototype.ex03.concrete_classes.Circle;
import br.com.rafael.gof.creational_patterns.prototype.ex03.concrete_classes.Rectangle;

import java.util.HashMap;
import java.util.Map;

public class AnotherTest {
    public static void main(String[] args) {
        ShapeRegistry shapes = new ShapeRegistry();
        Shape bigGreenCircle1 = shapes.get("Big Green Circle");
        Shape bigGreenCircle2 = shapes.get("Big Green Circle");
        System.out.println(bigGreenCircle1);
        System.out.println(bigGreenCircle2);
        if (bigGreenCircle1 != bigGreenCircle2) {
//            They are at different memory addresses.
            System.out.println("Big Green Circle clones are created at different memory addresses");
            if (bigGreenCircle1.equals(bigGreenCircle2))
                System.out.println("but conserve identical attribute values");
            else
                System.out.println("and do not conserve identical attribute values");
        } else
            System.out.println("Big Green Circle clones are only new reference variables to very same object");
    }

    private static class ShapeRegistry {
        private final Map<String, Shape> shapes;

        public ShapeRegistry() {
            shapes = new HashMap<>();
//            Default shapes...
            shapes.put("Big Green Circle", new Circle(0, 0, 100, Color.GREEN));
            shapes.put("Medium Green Circle", new Circle(0, 0, 50, Color.GREEN));
            shapes.put("Small Green Circle", new Circle(0,0,5,Color.GREEN));
            shapes.put("Big Blue Rectangle", new Rectangle(0,0,100, 100, Color.BLUE));
            shapes.put("Medium Blue Rectangle", new Rectangle(0,0,50, 50, Color.BLUE));
            shapes.put("Small Blue Rectangle", new Rectangle(0,0,5,5,Color.BLUE));
        }

        public void put(String key, Shape shape) {
            shapes.put(key, shape);
        }

        public Shape get(String key) {
            return shapes.get(key).cloneThis();
        }
    }
}
