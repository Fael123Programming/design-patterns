package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.linux;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Button;

public class LinuxButton implements Button {
    public void render(){
        System.out.println("A linux button is being rendered...");
    }

    public String getInfo(){
        return "A linux button...";
    }
}
