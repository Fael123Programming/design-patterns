package br.com.rafael.gof.creational_patterns.abstract_factory.ex03.concrete_factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex03.abstract_.*;

public class VolkswagenFactory implements CarFactory {
    @Override
    public ISportCar createSportCar() {
        return new SportVolkswagen();
    }

    @Override
    public IPopularCar createPopularCar() {
        return new PopularVolkswagen();
    }

    public static class SportVolkswagen implements ISportCar {}

    public static class PopularVolkswagen implements IPopularCar {}
}
