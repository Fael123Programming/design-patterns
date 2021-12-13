package br.com.rafael.gof.structural_patterns.composite.ex01.leaf_object;

import br.com.rafael.gof.structural_patterns.composite.ex01.interfaces.Component;

public class Leaf implements Component {
    //Attributes and another methods of this class...
    private final String string;

    public Leaf(String string) {
        this.string = string;
    }

    @Override
    public String execute(){
        //Do something recurring as a base of recursion.
        return string;
    }
}
