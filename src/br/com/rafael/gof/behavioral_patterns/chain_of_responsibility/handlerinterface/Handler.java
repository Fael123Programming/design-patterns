package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.handlerinterface;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.request.Request;

public interface Handler {
    void handle(Request request);
    Handler setNext(Handler handler);
    boolean canHandle(Request request);
}
