package br.com.rafael.gof.creational_patterns.abstract_factory.ex03.abstract_;

public interface CarFactory {
    IPopularCar createPopularCar();
    ISportCar createSportCar();
    //Abstract factory has more than one factory method, that is, you want to create
    //families of different types of objects but related in some point: in our case, we have
    //two big families of objects: sport cars and popular cars. They can be of different brands:
    //BMW, Chevrolet or Volkswagen.
    //For each concrete factory, two concrete objects must be created.
}
