package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.concretehandlers;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.handlerbaseclass.BaseHandler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.handlerinterface.Handler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.request.Request;

public class ConcreteHandlerC extends BaseHandler {
    public ConcreteHandlerC() {}

    public ConcreteHandlerC(Handler next) {
        super(next);
    }

    @Override
    public boolean canHandle(Request request) {
        return request.getType() == Request.C;
    }

    @Override
    public void solve(Request request) {
        System.out.println("Request (" + request + ") is being solved by a concrete handler C");
    }

    @Override
    public String toString() {
        return "a handler of type C";
    }
}
