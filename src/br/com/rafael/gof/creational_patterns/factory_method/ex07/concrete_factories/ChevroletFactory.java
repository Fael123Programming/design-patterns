package br.com.rafael.gof.creational_patterns.factory_method.ex07.concrete_factories;

import br.com.rafael.gof.creational_patterns.factory_method.ex07.interfaces.*;

public class ChevroletFactory implements CarFactory {
    @Override
    public ICar createCar() {
        return new Chevrolet();
    }

    public static class Chevrolet implements ICar {
        @Override
        public String getInfo() {
            return "Chevrolet car";
        }
    }
}
