package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.test;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.concretehandlers.ConcreteHandlerA;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.concretehandlers.ConcreteHandlerB;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.concretehandlers.ConcreteHandlerC;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.handlerbaseclass.BaseHandler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.handlerinterface.Handler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.request.Request;

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
