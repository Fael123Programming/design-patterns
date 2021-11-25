package br.com.rafael.gof.creational_patterns.prototype.ex03.abstract_class;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;

public abstract class Shape {
    private double x, y;
    private Color color;

    public Shape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape prototype) {
        //From inside the very class, we can access private attributes of an object with no problem!
        //Most languages do that!
        this.x = prototype.x;
        this.y = prototype.y;
        this.color = prototype.color;
    }

    public abstract Shape cloneThis();
    //The very object provides you a way to clone itself.
    //We work with the object.

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
