package br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.logistics;

import br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.transports.Ship;
import br.com.rafael.gof.creational_patterns.factory_method.ex03.interfaces.Transport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}
