package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.*;

public class Floor {
    private FloorType type;
    Color color;

    public Floor(FloorType type, Color color) {
        this.type = type;
        this.color = color;
    }

    public FloorType getType() {
        return type;
    }

    public void setType(FloorType type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "type=" + type +
                ", color=" + color +
                '}';
    }
}
