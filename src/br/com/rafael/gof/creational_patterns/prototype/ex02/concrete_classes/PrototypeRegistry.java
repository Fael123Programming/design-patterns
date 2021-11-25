package br.com.rafael.gof.creational_patterns.prototype.ex02.concrete_classes;

import br.com.rafael.gof.creational_patterns.prototype.ex02.interface_.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, Prototype> items;

    public PrototypeRegistry() {
        items = new HashMap<>();
    }

    public void addItem(String id, Prototype prototype) {
        items.put(id, prototype);
    }

    public Prototype getById(String id) {
        return items.get(id);
    }

    public Prototype getByColor(String color) {
        for (Prototype prototype : items.values())
            if (prototype.getColor().equals(color))
                return prototype.cloneThis(); //Clone this object instead of returning it.
        return null;
    }
}
