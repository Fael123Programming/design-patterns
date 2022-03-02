package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.concretehandlers;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.handlerbaseclass.BaseHandler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.handlerinterface.Handler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.request.Request;

public class ConcreteHandlerA extends BaseHandler {
    public ConcreteHandlerA() {}

    public ConcreteHandlerA(Handler next) {
        super(next);
    }

    @Override
    public boolean canHandle(Request request) {
        return request.getType() == Request.A; //For simplicity's sake.
    }

    @Override
    public void solve(Request request) {
        System.out.println("Request (" + request + ") is being solved by a concrete handler A");
    }

    @Override
    public String toString() {
        return "a handler of type A";
    }
}
