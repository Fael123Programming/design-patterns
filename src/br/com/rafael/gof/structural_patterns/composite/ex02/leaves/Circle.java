package br.com.rafael.gof.structural_patterns.composite.ex02.leaves;

public class Circle extends Dot {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Circle with radius " + radius + " drawn at (" + super.x + ", " + super.y + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " - radius " + radius;
    }
}
