package br.com.rafael.gof.structural_patterns.adapter.ex03.concrete_classes.other;

import br.com.rafael.gof.structural_patterns.adapter.ex03.interfaces.IRoundElement;

public class RoundHole implements IRoundElement {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public String getDescription(){
        return "A round hole";
    }
}
