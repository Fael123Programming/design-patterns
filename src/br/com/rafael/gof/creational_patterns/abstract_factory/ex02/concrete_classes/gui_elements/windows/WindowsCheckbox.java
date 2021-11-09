package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.windows;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Checkbox;

public class WindowsCheckbox implements Checkbox {
    public void render(){
        System.out.println("A windows checkbox is being rendered...");
    }

    public String getInfo(){
        return "A windows checkbox...";
    }
}
