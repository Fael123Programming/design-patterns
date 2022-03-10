package br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.concrete;

import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.interfaces.Memento;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history;

    {
        history = new Stack<>();
    }

    public void addMemento(Memento memento) {
        history.add(memento);
    }

    public Memento removeMemento() {
        return history.isEmpty() ? null : history.pop();
    }

    public void undo() {
        if (history.isEmpty())
            return;
        history.peek().restore();
        history.pop();
    }
}
