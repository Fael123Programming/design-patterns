package br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.logistics;

import br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.transports.Truck;
import br.com.rafael.gof.creational_patterns.factory_method.ex03.interfaces.Transport;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport(){ //Program to the interface not to the implementation.
        return new Truck();
    }
}
