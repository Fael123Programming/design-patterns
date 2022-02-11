package br.com.rafael.gof.structural_patterns.decorator.ex01.app;

import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.notifier.Notifier;

public class App {
    private Notifier notifier;

    public App() {
        //Attributes of the app to be initialized...
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public Notifier getNotifier() {
        return this.notifier;
    }

    public void sendMessageWithNotifier(String msg) {
        this.notifier.send(msg);
    }
}
