package br.com.rafael.gof.creational_patterns.factory_method.ex05.classes._abstract;

import br.com.rafael.gof.creational_patterns.factory_method.ex05.interfaces.Button;

public abstract class Dialog {
    public void render() { //See that all business logic here can be modified and override in Dialog's children classes.
        Button button = createButton(); //Calling the factory method!
        button.render();
    }

    public abstract Button createButton(); //Nothing left here, then it has to be abstract.
}
