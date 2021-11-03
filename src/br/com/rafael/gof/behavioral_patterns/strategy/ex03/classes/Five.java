package br.com.rafael.gof.behavioral_patterns.strategy.ex03.classes;

import br.com.rafael.gof.behavioral_patterns.strategy.ex03.interfaces.FortuneCookies;

public class Five implements FortuneCookies {
    @Override
    public void print(){
        System.out.println("It is your turn to get it.");
    }
}
