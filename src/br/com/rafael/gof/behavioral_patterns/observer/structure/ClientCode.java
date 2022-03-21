package br.com.rafael.gof.behavioral_patterns.observer.structure;

import br.com.rafael.gof.behavioral_patterns.observer.structure.abstractsubscriber.Subscriber;
import br.com.rafael.gof.behavioral_patterns.observer.structure.concretesubscribers.*;
import br.com.rafael.gof.behavioral_patterns.observer.structure.publisher.Publisher;

public class ClientCode {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("State 1");
        Subscriber s1 = new ConcreteSubscriberA(), s2 = new ConcreteSubscriberB();
        publisher.subscribe(s1);
        System.out.println(s1);
        publisher.subscribe(s2);
        System.out.println(s2);
        publisher.setMainState("State 2");
        System.out.println(s1);
        System.out.println(s2);
    }
}
