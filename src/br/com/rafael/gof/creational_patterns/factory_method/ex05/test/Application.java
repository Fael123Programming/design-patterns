package br.com.rafael.gof.creational_patterns.factory_method.ex05.test;

import br.com.rafael.gof.creational_patterns.factory_method.ex05.classes._abstract.Dialog;
import br.com.rafael.gof.creational_patterns.factory_method.ex05.classes.concrete.dialogs.*;
import br.com.rafael.gof.creational_patterns.factory_method.ex05.exceptions.UnknownApplicationEnvironmentException;

public class Application {
    private Dialog dialog;

    public void initialize(){
        dialog = switch(System.getProperty("os.name").toLowerCase()) {
            case "windows 10" -> new WindowsDialog();
            case "web" -> new WebDialog();
            default -> throw new UnknownApplicationEnvironmentException();
        };
    }

    public Dialog getDialog(){
        return this.dialog;
    }
}
