package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.*;

public class Pool {
    private PoolType type;
    private PoolStuff stuff;
    private Color color;
    private double area, deepnessMeters;

    public Pool(PoolType type, PoolStuff stuff, Color color, double area, double deepnessMeters) {
        this.type = type;
        this.stuff = stuff;
        this.color = color;
        this.area = area;
        this.deepnessMeters = deepnessMeters;
    }

    public PoolType getType() {
        return type;
    }

    public void setType(PoolType type) {
        this.type = type;
    }

    public PoolStuff getStuff() {
        return stuff;
    }

    public void setStuff(PoolStuff stuff) {
        this.stuff = stuff;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getDeepnessMeters() {
        return deepnessMeters;
    }

    public void setDeepnessMeters(double deepnessMeters) {
        this.deepnessMeters = deepnessMeters;
    }

    @Override
    public String toString() {
        return "Pool{" +
                "type=" + type +
                ", stuff=" + stuff +
                ", color=" + color +
                ", area=" + area +
                ", deepnessMeters=" + deepnessMeters +
                '}';
    }
}
