package br.com.rafael.gof.behavioral_patterns.memento.structure.interfacebased;

public class Originator {
    private int state;

    public Originator(int state) {
        this.state = state;
    }

    public Memento save() {
        return new ConcreteMemento(state);
    }

    public void restore(Memento memento) {
        this.state = ((ConcreteMemento) memento).getState();
    }
}
