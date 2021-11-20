package br.com.rafael.gof.creational_patterns.factory_method.ex07.concrete_factories;

import br.com.rafael.gof.creational_patterns.factory_method.ex07.interfaces.*;

public class VolkswagenFactory implements CarFactory {
    @Override
    public ICar createCar(){
        return new Volkswagen();
    }

    public static class Volkswagen implements ICar {
        @Override
        public String getInfo() {
            return "Volkswagen car";
        }
    }
}
