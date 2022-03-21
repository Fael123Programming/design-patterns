package br.com.rafael.gof.behavioral_patterns.observer.ex01.subscriber;

import java.io.IOException;

public interface EventListener { //Subscriber interface!
    void update(String filename) throws IOException;
}
