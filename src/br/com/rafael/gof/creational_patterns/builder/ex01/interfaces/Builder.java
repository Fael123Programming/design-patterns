package br.com.rafael.gof.creational_patterns.builder.ex01.interfaces;

//The builder interface must provide all common build methods to be implemented and perhaps used depending
//on the type of construction wanted.

public interface Builder {
    void reset(); //When called, it will reset the current object being constructed and put a new one there.

    void buildStep1();

    void buildStep2();

    void buildStep3();

}
