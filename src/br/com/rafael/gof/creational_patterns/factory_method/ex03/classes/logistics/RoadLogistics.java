package br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.logistics;

import br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.transports.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Truck createTransport(){
        return new Truck();
    }
}
