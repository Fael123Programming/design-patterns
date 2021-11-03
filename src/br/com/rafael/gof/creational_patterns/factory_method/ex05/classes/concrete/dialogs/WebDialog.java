package br.com.rafael.gof.creational_patterns.factory_method.ex05.classes.concrete.dialogs;

import br.com.rafael.gof.creational_patterns.factory_method.ex05.classes._abstract.Dialog;
import br.com.rafael.gof.creational_patterns.factory_method.ex05.classes.concrete.buttons.WebButton;
import br.com.rafael.gof.creational_patterns.factory_method.ex05.interfaces.Button;

public class WebDialog extends Dialog {
    @Override
    public Button createButton(){
        return new WebButton();
    }
}
