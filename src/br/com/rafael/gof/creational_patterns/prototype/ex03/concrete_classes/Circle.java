package br.com.rafael.gof.creational_patterns.prototype.ex03.concrete_classes;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;
import br.com.rafael.gof.creational_patterns.prototype.ex03.abstract_class.Shape;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle prototype) {
        super(prototype);
        this.radius = prototype.radius;
    }

    @Override
    public Shape cloneThis() {
        return new Circle(this);
    }
    //Do not create another object brethren or parent of this class.

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && this.getX() == circle.getX() && this.getY() == circle.getY()
                && this.getColor() == circle.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
