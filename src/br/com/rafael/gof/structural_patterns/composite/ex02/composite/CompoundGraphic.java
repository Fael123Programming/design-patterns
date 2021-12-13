package br.com.rafael.gof.structural_patterns.composite.ex02.composite;

import br.com.rafael.gof.structural_patterns.composite.ex02.interfaces.Graphic;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private final List<Graphic> graphicElements;

    {
        graphicElements = new ArrayList<>();
    }

    public void insert(Graphic newElement) {
        graphicElements.add(newElement);
    }

    public Graphic get(int index) {
        return graphicElements.get(index);
    }

    public Graphic remove(int index) {
        return graphicElements.remove(index);
    }

    @Override
    public void move(double x, double y){
        for (Graphic element : graphicElements)
            element.move(x, y);
    }

    @Override
    public String draw() {
        StringBuilder strBuilder = new StringBuilder();
        for (Graphic element : graphicElements)
            strBuilder.append(element.draw()).append("\n");
//        strBuilder.append("Compound graphic element drawn").append("\n");
        return strBuilder.toString();
    }
}
