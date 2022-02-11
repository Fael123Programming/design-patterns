package br.com.rafael.gof.structural_patterns.decorator.ex02.concrete;

import br.com.rafael.gof.structural_patterns.decorator.ex02.abstract_.Component;

public class ConcreteComponent implements Component {
    @Override
    public void execute() {
        System.out.println("ConcreteComponent instance at " + this  + " is executing something...");
    }
}
