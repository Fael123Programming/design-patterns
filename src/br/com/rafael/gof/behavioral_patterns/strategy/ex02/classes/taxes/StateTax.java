package br.com.rafael.gof.behavioral_patterns.strategy.ex02.classes.taxes;

import br.com.rafael.gof.behavioral_patterns.strategy.ex02.interfaces.ITax;

public class StateTax implements ITax {

    @Override
    public double calculateTax(double balance) {
        return balance * 0.15;
    }
}
