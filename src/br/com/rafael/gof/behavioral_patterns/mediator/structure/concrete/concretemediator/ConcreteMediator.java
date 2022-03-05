package br.com.rafael.gof.behavioral_patterns.mediator.structure.concrete.concretemediator;

import br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractcomponent.Component;
import br.com.rafael.gof.behavioral_patterns.mediator.structure.abstract_.abstractmediator.Mediator;
import br.com.rafael.gof.behavioral_patterns.mediator.structure.concrete.concretecomponents.*;

public class ConcreteMediator implements Mediator {
    private ConcreteComponentA cca;
    private ConcreteComponentB ccb;
    private ConcreteComponentC ccc;
    private ConcreteComponentD ccd;

    public void setComponentA(ConcreteComponentA componentA) {
        this.cca = componentA;
    }

    public void setComponentB(ConcreteComponentB componentB) {
        this.ccb = componentB;
    }

    public void setComponentC(ConcreteComponentC componentC) {
        this.ccc = componentC;
    }

    public void setComponentD(ConcreteComponentD componentD) {
        this.ccd = componentD;
    }

    @Override
    public void intimate(Component component) {
        if (component == cca)
            reactOnA();
        else if (component == ccb)
            reactOnB();
        else if (component == ccc)
            reactOnC();
        else if (component == ccd)
            reactOnD();
    }

    private void reactOnA() {
        System.out.println("Reacting to component of type A...");
    }

    private void reactOnB() {
        System.out.println("Reacting to component of type B...");
    }

    private void reactOnC() {
        System.out.println("Reacting to component of type C...");
    }

    private void reactOnD() {
        System.out.println("Reacting to component of type D...");
    }
}
