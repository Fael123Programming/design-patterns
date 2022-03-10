package br.com.rafael.gof.behavioral_patterns.memento.structure.yetmorerestrict.interfaces;

public interface Originator<T> {
    Memento save();

    void setState(T state);

    T getState();
}
