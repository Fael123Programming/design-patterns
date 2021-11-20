package br.com.rafael.gof.creational_patterns.abstract_factory.ex03.concrete_factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex03.abstract_.*;

public class BMWFactory implements CarFactory {
    @Override
    public ISportCar createSportCar() {
        return new SportBMW();
    }

    @Override
    public IPopularCar createPopularCar() {
        return new PopularBMW();
    }

    public static class SportBMW implements ISportCar {
    }

    public static class PopularBMW implements IPopularCar {
    }
}
