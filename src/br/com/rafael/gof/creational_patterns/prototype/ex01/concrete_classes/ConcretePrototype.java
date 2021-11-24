package br.com.rafael.gof.creational_patterns.prototype.ex01.concrete_classes;

import br.com.rafael.gof.creational_patterns.prototype.ex01.interface_.Prototype;

public class ConcretePrototype implements Prototype {
    private String field1;

    public ConcretePrototype(ConcretePrototype prototype) {
        this.field1 = prototype.field1;
    }

    @Override
    public Prototype cloneThis() {
        return new ConcretePrototype(this);
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
}
