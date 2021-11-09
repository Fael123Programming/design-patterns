package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.windows;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Dropdown;

public class WindowsDropdown implements Dropdown {
    public void render(){
        System.out.println("A windows dropdown is being rendered...");
    }

    public String getInfo(){
        return "A windows dropdown...";
    }
}
