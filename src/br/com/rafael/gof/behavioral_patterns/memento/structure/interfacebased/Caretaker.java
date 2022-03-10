package br.com.rafael.gof.behavioral_patterns.memento.structure.interfacebased;

import java.util.Stack;

public class Caretaker {
    private Originator originator;
    private Stack<Memento> history;

    {
        history = new Stack<>();
    }

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void originatorDoSomething() {
        history.push(originator.save());
    }

    public void originatorUndo() {
        if (history.isEmpty())
            return;
        originator.restore(history.pop());
    }

}
