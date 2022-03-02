package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.handlerinterface;

import br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.ex01.request.Request;

public interface Handler {
    void handle(Request request);
    Handler setNext(Handler handler);
    boolean canHandle(Request request);
}
