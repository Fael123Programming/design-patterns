package br.com.rafael.gof.behavioral_patterns.observer.structure.concretesubscribers;

public class ConcreteSubscriberA extends BaseConcreteSubscriber {
    @Override
    public String toString() {
        return "A concrete subscriber A with context: " + super.context;
    }
}
