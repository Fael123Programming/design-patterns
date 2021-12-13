package br.com.rafael.gof.structural_patterns.composite.ex01;

import br.com.rafael.gof.structural_patterns.composite.ex01.complex_object.Composite;
import br.com.rafael.gof.structural_patterns.composite.ex01.interfaces.Component;
import br.com.rafael.gof.structural_patterns.composite.ex01.leaf_object.Leaf;

public class Main {
    public static void main(String[] args) {
        Component[] cmpns = {new Leaf("First leaf"), new Leaf("Second leaf"), new Leaf("Third leaf"),
                new Leaf("Fourth leaf"), new Leaf("Fifth leaf")};
        Composite composite = new Composite();
        for (int i = 0; i < 5; i++)
            composite.insert(cmpns[i]);
        Composite aBiggerComposite = new Composite();
        Component[] cmpns2 = {new Leaf("Sixth leaf"), new Leaf("Seventh leaf"), new Leaf("Eighth leaf"),
                new Leaf("Ninth leaf"), new Leaf("Tenth leaf")};
        aBiggerComposite.insert(composite); //That is very crazy!
        for (int i = 0; i < 5; i++)
            aBiggerComposite.insert(cmpns2[i]);
        System.out.println(aBiggerComposite.execute());
    }
}
