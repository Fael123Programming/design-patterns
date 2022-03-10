package br.com.rafael.gof.behavioral_patterns.memento.structure.nestedclasses;

import java.util.Stack;

public class Caretaker {
    private final Originator originator; //The object who to save its states...
    private final Stack<Originator.Memento> history; //The stack of different states of the originator.

    public Caretaker(Originator originator) {
        this.originator = originator;
        history = new Stack<>();
    }

    public void originatorDoSomething() {
//      Before the originator do something we shall save its state...
        history.push(originator.save());
//      originator.doSomethingElseThatChangesItsState();
    }

    public void originatorUndo() {
        if (history.isEmpty())
            return; //Cannot undo any further...
        originator.restore(history.pop());
    }
}
