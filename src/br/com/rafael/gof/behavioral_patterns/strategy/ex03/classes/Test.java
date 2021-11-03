package br.com.rafael.gof.behavioral_patterns.strategy.ex03.classes;

import br.com.rafael.gof.behavioral_patterns.strategy.ex03.interfaces.FortuneCookies;

public class Test {
    public static void main(String[] args) {
        goodFortune();
    }

    public static void goodFortune() {
        FortuneCookies cookie = switch ((new Dice()).throwIt(1, 5)) {
            case 2 -> new Two();
            case 5 -> new Five();
            default -> new Null();
        };
        cookie.print();
    }
}
