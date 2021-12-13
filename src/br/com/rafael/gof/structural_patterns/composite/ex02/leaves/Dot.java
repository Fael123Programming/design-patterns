package br.com.rafael.gof.structural_patterns.composite.ex02.leaves;

import br.com.rafael.gof.structural_patterns.composite.ex02.interfaces.Graphic;

public class Dot implements Graphic {
    protected double x, y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String draw() {
        return "Dot drawn at (" + x + ", " + y + ")";
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y +")";
    }
}
