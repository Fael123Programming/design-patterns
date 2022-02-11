package br.com.rafael.gof.structural_patterns.decorator.ex02.main;

import br.com.rafael.gof.structural_patterns.decorator.ex02.abstract_.Component;
import br.com.rafael.gof.structural_patterns.decorator.ex02.concrete.ConcreteComponent;
import br.com.rafael.gof.structural_patterns.decorator.ex02.concrete.ConcreteDecorator1;
import br.com.rafael.gof.structural_patterns.decorator.ex02.concrete.ConcreteDecorator2;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecorator1 cd1 = new ConcreteDecorator1(cc);
        ConcreteDecorator2 cd2 = new ConcreteDecorator2(cd1);
        cd2.execute();
        System.out.println("----------------------------------------");
        Component c = new ConcreteComponent();
        c = new ConcreteDecorator1(c);
        c = new ConcreteDecorator2(c);
        c.execute();
    }
}
