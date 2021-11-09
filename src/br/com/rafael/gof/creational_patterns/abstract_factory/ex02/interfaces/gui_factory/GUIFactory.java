package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_factory;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.*;

//This is the abstract factory used in this example.
//Products are buttons, checkboxes and dropdowns.
//This pattern is used in practical situations wherein cross-platform apps are needed. For example:
//a very same application which has to be rendered in many operating systems.
//Then according to the system, a different implementation of a GUI factory will be created
//to provide user the correct visual presentation.

public interface GUIFactory { //Graphics User Interface.
    Button createButton();
    Checkbox createCheckbox();
    Dropdown createDropdown();
}
