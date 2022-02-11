package br.com.rafael.gof.structural_patterns.decorator.ex02.concrete;

import br.com.rafael.gof.structural_patterns.decorator.ex02.abstract_.BaseDecorator;
import br.com.rafael.gof.structural_patterns.decorator.ex02.abstract_.Component;

public class ConcreteDecorator1 extends BaseDecorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        System.out.println("ConcreteDecorator1 instance at " + this + " is executing something...");
        super.execute();
    }
}
