package br.com.rafael.gof.behavioral_patterns.chain_of_responsibility.exception;

public class EndOfChainException extends RuntimeException {
    public EndOfChainException() {
        super("we've reached the end of the chain");
    }
}
