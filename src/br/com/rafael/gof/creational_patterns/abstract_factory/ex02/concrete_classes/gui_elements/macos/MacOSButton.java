package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.macos;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Button;

public class MacOSButton implements Button {
    public void render(){
        System.out.println("A macOS button is being rendered...");
    }

    public String getInfo(){
        return "A macOS button...";
    }
}
