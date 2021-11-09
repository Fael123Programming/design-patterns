package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.linux.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_factory.GUIFactory;

public class LinuxGUIFactory implements GUIFactory {
    public Button createButton(){
        //All business and design logic to create a linux button...
        return new LinuxButton();
    }

    public Checkbox createCheckbox(){
        //All business and design logic to create a linux checkbox...
        return new LinuxCheckbox();
    }

    public Dropdown createDropdown(){
        //All business and design logic to create a linux dropdown...
        return new LinuxDropdown();
    }
}
