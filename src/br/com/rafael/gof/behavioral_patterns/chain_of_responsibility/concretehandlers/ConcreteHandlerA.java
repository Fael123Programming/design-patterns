package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.concretehandlers;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.handlerbaseclass.BaseHandler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.handlerinterface.Handler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.request.Request;

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
