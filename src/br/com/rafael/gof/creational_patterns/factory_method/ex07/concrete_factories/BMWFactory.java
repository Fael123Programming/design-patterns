package br.com.rafael.gof.creational_patterns.factory_method.ex07.concrete_factories;

import br.com.rafael.gof.creational_patterns.factory_method.ex07.interfaces.*;

public class BMWFactory implements CarFactory {
    @Override
    public ICar createCar() {
        return new BMW();
    }

    public static class BMW implements ICar {
        @Override
        public String getInfo() {
            return "BMW car";
        }
    }
}
