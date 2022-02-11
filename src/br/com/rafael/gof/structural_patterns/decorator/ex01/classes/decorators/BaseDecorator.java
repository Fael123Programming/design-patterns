package br.com.rafael.gof.structural_patterns.decorator.ex01.classes.decorators;

import br.com.rafael.gof.structural_patterns.decorator.ex01.classes.notifier.Notifier;

public class BaseDecorator extends Notifier {
    private Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    public Notifier getNotifier() {
        return this.notifier;
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String msg) {
        this.notifier.send(msg);
    }
}
