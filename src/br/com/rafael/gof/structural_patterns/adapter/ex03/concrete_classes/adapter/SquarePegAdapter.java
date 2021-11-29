package br.com.rafael.gof.structural_patterns.adapter.ex03.concrete_classes.adapter;

import br.com.rafael.gof.structural_patterns.adapter.ex03.concrete_classes.other.*;
import br.com.rafael.gof.structural_patterns.adapter.ex03.interfaces.IRoundElement;

//This adapter pretends a square peg as a round peg.

public class SquarePegAdapter implements IRoundElement {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public SquarePeg getPeg() {
        return peg;
    }

    public void setPeg(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return peg.getWidthBase() * Math.sqrt(2) / 2;
    }

    @Override
    public String getDescription(){
        return "A square peg wanting to be a round one";
    }
}
