package br.com.rafael.gof.behavioral_patterns.mediator.structure;

import br.com.rafael.gof.behavioral_patterns.mediator.structure.concrete.concretecomponents.*;
import br.com.rafael.gof.behavioral_patterns.mediator.structure.concrete.concretemediator.ConcreteMediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteComponentA componentA = new ConcreteComponentA(mediator);
        ConcreteComponentB componentB = new ConcreteComponentB(mediator);
        ConcreteComponentC componentC = new ConcreteComponentC(mediator);
        ConcreteComponentD componentD = new ConcreteComponentD(mediator);
        mediator.setComponentA(componentA);
        mediator.setComponentB(componentB);
        mediator.setComponentB(componentB);
        mediator.setComponentC(componentC);
        mediator.setComponentD(componentD);
        componentA.operation();
        componentB.operation();
        componentC.operation();
        componentD.operation();
    }
}
