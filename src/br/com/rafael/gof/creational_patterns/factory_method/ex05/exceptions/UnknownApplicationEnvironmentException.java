package br.com.rafael.gof.creational_patterns.factory_method.ex05.exceptions;

public class UnknownApplicationEnvironmentException extends RuntimeException {
    public UnknownApplicationEnvironmentException(){
        super("There was an error when identifying this system's environment");
    }
}
