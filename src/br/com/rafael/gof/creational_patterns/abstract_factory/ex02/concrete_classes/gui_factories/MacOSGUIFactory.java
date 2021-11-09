package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.macos.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_factory.GUIFactory;

public class MacOSGUIFactory implements GUIFactory {
    public Button createButton(){
        //All business and design logic to create a macOS button...
        return new MacOSButton();
    }

    public Checkbox createCheckbox(){
        //All business and design logic to create a macOS checkbox...
        return new MacOSCheckbox();
    }

    public Dropdown createDropdown(){
        //All business and design logic to create a macOS dropdown...
        return new MacOSDropdown();
    }
}
