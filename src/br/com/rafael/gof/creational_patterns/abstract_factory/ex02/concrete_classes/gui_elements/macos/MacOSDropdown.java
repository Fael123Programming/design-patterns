package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.macos;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.Dropdown;

public class MacOSDropdown implements Dropdown {
    public void render(){
        System.out.println("A macOS dropdown is being rendered...");
    }

    public String getInfo(){
        return "A macOS dropdown...";
    }
}
