package br.com.rafael.gof.creational_patterns.factory_method.ex05.classes.concrete.dialogs;

import br.com.rafael.gof.creational_patterns.factory_method.ex05.classes._abstract.Dialog;
import br.com.rafael.gof.creational_patterns.factory_method.ex05.classes.concrete.buttons.WindowsButton;
import br.com.rafael.gof.creational_patterns.factory_method.ex05.interfaces.Button;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
}
