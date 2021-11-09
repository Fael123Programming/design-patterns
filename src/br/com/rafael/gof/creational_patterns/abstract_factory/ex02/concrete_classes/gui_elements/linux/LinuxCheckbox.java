package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.linux;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Checkbox;

public class LinuxCheckbox implements Checkbox {
    public void render(){
        System.out.println("A linux checkbox is being rendered...");
    }

    public String getInfo(){
        return "A linux checkbox...";
    }
}
