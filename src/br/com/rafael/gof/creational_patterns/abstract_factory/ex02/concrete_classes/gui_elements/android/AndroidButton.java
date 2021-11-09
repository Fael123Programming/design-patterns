package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.android;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Button;

public class AndroidButton implements Button {
    public void render(){
        System.out.println("An android button is being rendered...");
    }

    public String getInfo(){
        return "An android button...";
    }
}
