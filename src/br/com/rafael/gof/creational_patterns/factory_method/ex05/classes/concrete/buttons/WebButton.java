package br.com.rafael.gof.creational_patterns.factory_method.ex05.classes.concrete.buttons;

import br.com.rafael.gof.creational_patterns.factory_method.ex05.interfaces.*;

public class WebButton implements Button {
    public void render(){
        System.out.println("Rendering this web button seamlessly...");
    }

    public void onClick() {
        System.out.println("Click!");
    }
}
