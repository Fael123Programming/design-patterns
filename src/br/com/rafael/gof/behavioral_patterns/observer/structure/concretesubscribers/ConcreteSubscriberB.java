package br.com.rafael.gof.behavioral_patterns.observer.structure.concretesubscribers;

public class ConcreteSubscriberB extends BaseConcreteSubscriber {
    @Override
    public String toString() {
        return "A concrete subscriber B with context: " + super.context;
    }
}
