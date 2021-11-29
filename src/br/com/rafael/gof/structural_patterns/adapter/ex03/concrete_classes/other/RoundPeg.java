package br.com.rafael.gof.structural_patterns.adapter.ex03.concrete_classes.other;

import br.com.rafael.gof.structural_patterns.adapter.ex03.interfaces.IRoundElement;

public class RoundPeg implements IRoundElement {
    private double radiusBase, length;

    public RoundPeg(double radiusBase, double length) {
        this.radiusBase = radiusBase;
        this.length = length;
    }

    @Override
    public double getRadius() {
        return radiusBase;
    }

    @Override
    public String getDescription(){
        return "A round peg";
    }

    public void setRadiusBase(double radiusBase) {
        this.radiusBase = radiusBase;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
