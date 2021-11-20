package br.com.rafael.gof.creational_patterns.abstract_factory.ex03.concrete_factories;

import br.com.rafael.gof.creational_patterns.abstract_factory.ex03.abstract_.*;

public class ChevroletFactory implements CarFactory {
    @Override
    public ISportCar createSportCar() {
        return new SportChevrolet();
    }

    @Override
    public IPopularCar createPopularCar() {
        return new PopularChevrolet();
    }

    public static class SportChevrolet implements ISportCar {}

    public static class PopularChevrolet implements IPopularCar {}
}
