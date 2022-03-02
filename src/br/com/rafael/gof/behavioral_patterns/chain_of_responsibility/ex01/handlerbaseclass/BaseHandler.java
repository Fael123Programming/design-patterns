package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.handlerbaseclass;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.exception.EndOfChainException;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.handlerinterface.Handler;
import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.request.Request;

//This class shall not have real instances (that's why is set to be abstract). It only works as
//a class to define some standard behavior for all handlers. Of course, it will depend on your situation.
//It's optional though.

public abstract class BaseHandler implements Handler {
    private Handler next;

    public BaseHandler() {}

    public BaseHandler(Handler next) {
        this.next = next;
    }

    @Override
    public Handler setNext(Handler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public void handle(Request request) throws EndOfChainException {
        if (this.canHandle(request)) {
            //Do some behavior to answer the request nicely.
            this.solve(request);
        } else {
            System.out.println("The request (" + request + ") could not be solved by handler (" + this + ")");
            if (this.next == null)
                throw new EndOfChainException(); //Unsolvable request.
            this.next.handle(request);
        }
    }

    public abstract void solve(Request request);
}
