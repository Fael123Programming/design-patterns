package br.com.rafael.gof.structural_patterns.adapter.ex03.concrete_classes.other;

//Incompatible class!
//The other elements are rounded.
//There must be an adapter to provide a way of communication for these classes.

public class SquarePeg {
    private double widthBase, length;

    public SquarePeg(double widthBase, double length) {
        this.widthBase = widthBase;
        this.length = length;
    }

    public double getWidthBase() {
        return widthBase;
    }

    public void setWidthBase(double widthBase) {
        this.widthBase = widthBase;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
