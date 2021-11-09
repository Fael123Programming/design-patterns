package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.windows.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_factory.GUIFactory;

public class WindowsGUIFactory implements GUIFactory {
    public Button createButton(){
        //All business and design logic to create a windows button...
        return new WindowsButton();
    }

    public Checkbox createCheckbox(){
        //All business and design logic to create a windows checkbox...
        return new WindowsCheckbox();
    }

    public Dropdown createDropdown(){
        //All business and design logic to create a windows dropdown...
        return new WindowsDropdown();
    }
}
