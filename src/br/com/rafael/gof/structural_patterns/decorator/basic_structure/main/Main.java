package br.com.rafael.gof.structural_patterns.decorator.basic_structure.main;

import br.com.rafael.gof.structural_patterns.decorator.basic_structure.abstract_.Component;
import br.com.rafael.gof.structural_patterns.decorator.basic_structure.concrete.component.ConcreteComponent;
import br.com.rafael.gof.structural_patterns.decorator.basic_structure.concrete.decorators.ConcreteDecorator1;
import br.com.rafael.gof.structural_patterns.decorator.basic_structure.concrete.decorators.ConcreteDecorator2;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorator1 cd1 = new ConcreteDecorator1(component);
        ConcreteDecorator2 cd2 = new ConcreteDecorator2(cd1);
        cd2.execute();
        System.out.println("----------------------------------------");
        component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.execute();
    }
}
