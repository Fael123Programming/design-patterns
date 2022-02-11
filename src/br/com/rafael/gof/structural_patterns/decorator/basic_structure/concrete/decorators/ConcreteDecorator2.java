package br.com.rafael.gof.structural_patterns.decorator.basic_structure.concrete.decorators;

import br.com.rafael.gof.structural_patterns.decorator.basic_structure.abstract_.BaseDecorator;
import br.com.rafael.gof.structural_patterns.decorator.basic_structure.abstract_.Component;

public class ConcreteDecorator2 extends BaseDecorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        System.out.println("ConcreteDecorator2 instance at " + this + " is executing something...");
        super.execute();
    }
}
