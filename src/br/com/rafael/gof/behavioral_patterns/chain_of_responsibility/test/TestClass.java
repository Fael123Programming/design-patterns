package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.test;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.concretehandlers.ConcreteHandlerA;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.concretehandlers.ConcreteHandlerB;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.concretehandlers.ConcreteHandlerC;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.handlerbaseclass.BaseHandler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.handlerinterface.Handler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.request.Request;

public class TestClass {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandlerA();
        BaseHandler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();
        h1.setNext(h2).setNext(h3); //In-chain binding
        Request request = new Request(Request.C);
        h1.handle(request);
    }
}
