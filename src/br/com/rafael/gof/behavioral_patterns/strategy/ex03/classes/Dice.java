package br.com.rafael.gof.behavioral_patterns.strategy.ex03.classes;

public class Dice {
    public int throwIt(int n1, int n2) {
        return (int) (n1 + (Math.random() * (n2 - n1 + 1)));
    }
}
