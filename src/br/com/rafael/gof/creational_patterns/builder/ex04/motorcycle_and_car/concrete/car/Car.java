package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.engine.Engine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.tire.Tire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.vehicle.Vehicle;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.wheel.Wheel;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_engines.CarEngine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_tires.CarTire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_wheels.CarWheel;

import java.util.Arrays;

public class Car extends Vehicle {

    @Override
    public void setEngine(Engine engine) {
        if (engine == null)
            throw new IllegalArgumentException("engine cannot be null");
        if (!(engine instanceof CarEngine))
            throw new IllegalArgumentException("engine must be a car engine");
        this.engine = engine;
    }

    @Override
    public void setWheels(Wheel[] wheels) {
        if (wheels == null)
            throw new IllegalArgumentException("wheels cannot be null");
        if (wheels.length != 4)
            throw new IllegalArgumentException("a car needs 4 wheels");
        for (Wheel wheel : wheels)
            if (!(wheel instanceof CarWheel))
                throw new IllegalArgumentException("all wheels must be car wheels");
        this.wheels = wheels;
    }

    @Override
    public void setTires(Tire[] tires) {
        if (tires == null)
            throw new IllegalArgumentException("tires cannot be null");
        if (tires.length != 4)
            throw new IllegalArgumentException("a car needs 4 tires");
        for (Tire tire : tires)
            if (!(tire instanceof CarTire))
                throw new IllegalArgumentException("all tires must be car tires");
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manual=" + this.getManual() +
                ", brand='" + this.getBrand() + '\'' +
                ", model='" + this.getModel() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", engine=" +  this.engine +
                ", wheels=" + Arrays.toString(this.wheels) +
                ", tires=" + Arrays.toString(this.tires) +
                '}';
    }
}
