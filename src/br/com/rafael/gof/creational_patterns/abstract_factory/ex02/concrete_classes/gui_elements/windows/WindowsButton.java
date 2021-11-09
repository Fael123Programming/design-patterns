package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.windows;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Button;

public class WindowsButton implements Button {
    public void render(){
        System.out.println("A windows button is being rendered...");
    }

    public String getInfo(){
        return "A windows button...";
    }
}
