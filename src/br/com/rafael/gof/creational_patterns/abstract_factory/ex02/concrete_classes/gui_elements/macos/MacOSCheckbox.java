package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.macos;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Checkbox;

public class MacOSCheckbox implements Checkbox {
    public void render(){
        System.out.println("A macOS checkbox is being rendered...");
    }

    public String getInfo(){
        return "A macOS checkbox...";
    }
}


