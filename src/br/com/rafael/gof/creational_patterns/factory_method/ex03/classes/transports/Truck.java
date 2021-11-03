package br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.transports;

import br.com.rafael.gof.creational_patterns.factory_method.ex03.interfaces.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery delivered successfully through land.");
    }
}
