package br.com.rafael.gof.creational_patterns.factory_method.ex03.classes.logistics;

import br.com.rafael.gof.creational_patterns.factory_method.ex03.interfaces.Transport;

import java.time.LocalDateTime;

public abstract class Logistics {
    private Transport transport;
    private LocalDateTime departure, arrival;

    public void planDelivery(LocalDateTime departure, LocalDateTime arrival){
        this.departure = departure;
        this.arrival = arrival;
        this.transport = createTransport();
    }

    public abstract Transport createTransport();
    //This is the factory method itself. See that we need an interface to be implemented by
    //our product classes: all of them must assume itself as a transport and must know how to
    //deliver.

    public Transport getTransport(){
        return this.transport;
    }

    public String getDeparture(){ return this.departure.toString(); }

    public String getArrival(){ return this.arrival.toString(); }
}
