package br.com.rafael.gof.behavioral_patterns.strategy.ex02.exceptions;

public class InvalidTaxNameException extends Exception {

    public InvalidTaxNameException(){
        super("Invalid tax name");
    }
}
