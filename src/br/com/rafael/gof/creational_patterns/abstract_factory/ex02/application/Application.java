package br.com.rafael.gof.creational_patterns.abstract_factory.ex02.application;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.concrete_classes.gui_factories.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_elements.*;
import br.com.rafael.gof.creational_patterns.abstract_factory.ex02.interfaces.gui_factory.GUIFactory;
import br.com.rafael.gof.creational_patterns.factory_method.ex05.exceptions.UnknownApplicationEnvironmentException;

import java.util.Locale;

public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;
    private Dropdown dropdown;
    private String os;

    public Application(){
//        Everything rounds around this line below: according to some system property
//        this app might act differently.
        os = System.getProperty("os.name").toLowerCase();
    }

    public void launch(){
        factory = switch(os) {
            case "windows 10" -> new WindowsGUIFactory();
            case "android" -> new AndroidGUIFactory();
            case "linux" -> new LinuxGUIFactory();
            case "macos" -> new MacOSGUIFactory();
            default -> throw new UnknownApplicationEnvironmentException();
        };
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        dropdown = factory.createDropdown();
        button.render();
        checkbox.render();
        dropdown.render();
    }

    public GUIFactory getFactory() {
        return factory;
    }

    public Button getButton() {
        return button;
    }

    public Checkbox getCheckbox() {
        return checkbox;
    }

    public Dropdown getDropdown() {
        return dropdown;
    }

//    This method would not be allowed in a real situation: user code can never have this level
//    of manipulation over your application.
    public void setOS(String newOS){
        os = newOS;
    }
}
