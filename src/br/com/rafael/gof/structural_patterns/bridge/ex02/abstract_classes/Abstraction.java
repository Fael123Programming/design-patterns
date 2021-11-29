package br.com.rafael.gof.structural_patterns.bridge.ex02.abstract_classes;

import br.com.rafael.gof.structural_patterns.bridge.ex02.interfaces.Implementable;

//This class and the interface Implementable comprise the bridge.
//It allows two class hierarchies (families of objects) to be used seamlessly.

public class Abstraction {
    private Implementable object;

    public Abstraction(Implementable obj) {
        object = obj;
    }

    public void feature1() {
        object.method1();
    }

    public void feature2() {
        object.method2();
    }

    public void feature3() {
        object.method3();
    }

    public Implementable getObject() {
        return object;
    }

    public void setObject(Implementable object) {
        this.object = object;
    }
}
