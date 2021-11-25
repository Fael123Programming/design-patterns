package br.com.rafael.gof.creational_patterns.prototype.ex03.concrete_classes;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;
import br.com.rafael.gof.creational_patterns.prototype.ex03.abstract_class.Shape;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double x, double y, double width, double height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle prototype) {
        //It is necessary to pass prototype to the super class constructor because
        //there we can have access to private attributes of this class to copy them.
        super(prototype);
        this.width = prototype.width;
        this.height = prototype.height;
    }

    @Override
    public Shape cloneThis() {
        return new Rectangle(this);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
