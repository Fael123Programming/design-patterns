package br.com.rafael.gof.behavioral_patterns.memento.structure.nestedclasses;

public class Originator {
    private int state;

    public Originator(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(this.state);
    }

    public void restore(Memento memento) {
        this.state = memento.state;
    }

    public static class Memento {
        private final int state; //Unchangeable data.

        public Memento(int state) {
            this.state = state;
        }
    }
}
