package br.com.rafael.gof.creational_patterns.prototype.ex01.concrete_classes;

import br.com.rafael.gof.creational_patterns.prototype.ex01.interface_.Prototype;

public class SubclassPrototype extends ConcretePrototype {
    private String field2;

    public SubclassPrototype(SubclassPrototype prototype) {
        super(prototype);
        this.field2 = prototype.field2;
    }

    @Override
    public Prototype cloneThis() {
        return new SubclassPrototype(this);
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}
