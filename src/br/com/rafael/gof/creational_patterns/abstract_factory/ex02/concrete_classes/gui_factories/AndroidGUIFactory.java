package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_elements.android.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_factory.GUIFactory;

public class AndroidGUIFactory implements GUIFactory {
    public Button createButton(){
        //All business and design logic to create an android button.
        return new AndroidButton();
    }

    public Checkbox createCheckbox(){
        //All business and design logic to create an android checkbox.
        return new AndroidCheckbox();
    }

    public Dropdown createDropdown(){
        //All business and design logic to create an android dropdown.
        return new AndroidDropdown();
    }
}
