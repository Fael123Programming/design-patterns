package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.networkconnector;

public class NetworkConnector {
    public void connect() {
        try {
            Thread.sleep(2500);
        } catch(InterruptedException ignore) {}
    }
}
