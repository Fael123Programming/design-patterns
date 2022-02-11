package br.com.rafael.gof.structural_patterns.decorator.basic_structure.concrete.component;

import br.com.rafael.gof.structural_patterns.decorator.basic_structure.abstract_.Component;

public class ConcreteComponent implements Component {
    @Override
    public void execute() {
        System.out.println("ConcreteComponent instance at " + this  + " is executing something...");
    }
}
