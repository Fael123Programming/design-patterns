package br.com.rafael.gof.creational_patterns.factory_method.ex03;

import br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.logistics.*;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        Logistics l1 = new RoadLogistics();
        l1.planDelivery(LocalDateTime.now(), LocalDateTime.now().plusDays(10));
        System.out.println(l1.getDeparture());
        System.out.println(l1.getArrival());
        l1.getTransport().deliver();
        l1 = new SeaLogistics();
        l1.planDelivery(LocalDateTime.now().minusDays(5).minusHours(5), LocalDateTime.now());
        System.out.println(l1.getDeparture());
        System.out.println(l1.getArrival());
        l1.getTransport().deliver();
    }
}
