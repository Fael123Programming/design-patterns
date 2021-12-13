package br.com.rafael.gof.structural_patterns.composite.ex01.complex_object;

import br.com.rafael.gof.structural_patterns.composite.ex01.interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final List<Component> components;

    {
        components = new ArrayList<>();
    }

    public Component getComponent(int index) {
        return components.get(index);
    }

    public boolean insert(Component comp) {
        return components.add(comp);
    }

    public Component remove(int index) {
        return components.remove(index);
    }

    @Override
    public String execute(){
        StringBuilder strBuilder = new StringBuilder();
        for (Component comp : components)
            strBuilder.append(comp.execute());
        return strBuilder.toString();
    }
}
