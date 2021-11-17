package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.*;

public class Roof {
    private RoofType type;
    private double area;
    private Color color;

    public Roof(RoofType type, Color color, double area) {
        this.type = type;
        this.area = area;
        this.color = color;
    }

    public RoofType getType() {
        return type;
    }

    public void setType(RoofType type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "type=" + type +
                ", area=" + area +
                ", color=" + color +
                '}';
    }
}
