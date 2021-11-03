package br.com.rafael.gof.behavioral_patterns.strategy.ex03.classes;

import br.com.rafael.gof.behavioral_patterns.strategy.ex03.interfaces.FortuneCookies;

public class Null implements FortuneCookies {
    @Override
    public void print(){
        System.out.println("You got nothing.");
    }
}
