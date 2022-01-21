package br.com.rafael.gof.creational_patterns.builder.ex04;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.Car;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.Motorcycle;
import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.concrete_builders.car.SportingCarBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.concrete_builders.motorcycle.MotorcycleBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex04.pattern_classes.director.Director;

public class Test {
    public static void main(String[] args) {
        MotorcycleBuilder motorcycleBuilder = new MotorcycleBuilder();
        Director director = new Director(motorcycleBuilder);
        director.createVehicle("Black");
        Motorcycle motorcycle = motorcycleBuilder.getResult();
        System.out.println(motorcycle);
        SportingCarBuilder sportingCarBuilder = new SportingCarBuilder();
        director.setBuilder(sportingCarBuilder);
        director.createVehicle("White");
        Car sportingCar = sportingCarBuilder.getResult();
        System.out.println(sportingCar);
    }
}
