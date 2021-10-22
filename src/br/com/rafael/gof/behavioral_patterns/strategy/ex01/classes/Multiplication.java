package br.com.rafael.gof.behavioral_patterns.strategy.ex01.classes;

import br.com.rafael.gof.behavioral_patterns.strategy.ex01.interfaces.IOperation;

public class Multiplication implements IOperation {

    public double calculate(double op1, double op2) {
        return op1 * op2;
    }
}
