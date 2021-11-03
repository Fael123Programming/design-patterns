package br.com.rafael.gof.behavioral_patterns.strategy.ex03.classes;

import br.com.rafael.gof.behavioral_patterns.strategy.ex03.interfaces.FortuneCookies;

public class Two implements FortuneCookies {
    @Override
    public void print() {
        System.out.println("It is never too late to start.");
    }
}
