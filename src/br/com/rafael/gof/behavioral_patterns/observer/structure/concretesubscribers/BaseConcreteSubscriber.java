package br.com.rafael.gof.behavioral_patterns.observer.structure.concretesubscribers;

import br.com.rafael.gof.behavioral_patterns.observer.structure.abstractsubscriber.Subscriber;

public abstract class BaseConcreteSubscriber implements Subscriber {
    protected String context;

    public BaseConcreteSubscriber() {
        context = "not subscribed in any publisher yet";
    }

    public String getContext () {
        return context;
    }

    @Override
    public void update(String context) {
        this.context = context;
    }
}
