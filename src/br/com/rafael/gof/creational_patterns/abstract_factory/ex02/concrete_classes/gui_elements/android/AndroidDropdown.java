package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.android;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Dropdown;

public class AndroidDropdown implements Dropdown {
    public void render(){
        System.out.println("An android dropdown is being rendered...");
    }

    public String getInfo(){
        return "An android dropdown...";
    }
}
