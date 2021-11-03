package br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.logistics;

import br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.transports.Ship;

public class SeaLogistics extends Logistics {
    @Override
    public Ship createTransport(){
        return new Ship();
    }
}
