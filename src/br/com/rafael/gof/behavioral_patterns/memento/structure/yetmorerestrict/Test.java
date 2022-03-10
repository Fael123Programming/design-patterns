package br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict;

import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.concrete.Caretaker;
import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.concrete.ConcreteOriginator;
import br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.interfaces.Originator;

public class Test {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator<Integer> orig = new ConcreteOriginator<>(100);
        caretaker.addMemento(orig.save());
        orig.setState(300);
        System.out.println("Former state: " + orig.getState());
        caretaker.undo();
        System.out.println("Current state: " + orig.getState());
    }
}
