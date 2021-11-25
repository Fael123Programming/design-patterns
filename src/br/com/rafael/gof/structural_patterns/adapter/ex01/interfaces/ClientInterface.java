package br.com.rafael.gof.structural_patterns.adapter.ex01.interfaces;

@FunctionalInterface //Lambda available!
public interface ClientInterface {
//    This pattern allows you to convert data types one to another and
//    to put two objects of different interfaces onto communication.
//    This interface is the way the client code (business logic of
//    the program) has to communicate externally.
//    The adapter object needs to implement it.

    char[] getSomething(String data);
}
