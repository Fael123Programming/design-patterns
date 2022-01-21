package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.engine.Engine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.tire.Tire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.vehicle.Vehicle;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.wheel.Wheel;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_engines.MotorcycleEngine;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_tires.MotorcycleTire;
import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_wheels.MotorcycleWheel;

import java.util.Arrays;

public class Motorcycle extends Vehicle {

    @Override
    public void setEngine(Engine engine) {
        if (engine == null)
            throw new IllegalArgumentException("engine cannot be null");
        if (!(engine instanceof MotorcycleEngine))
            throw new IllegalArgumentException("engine must be a motorcycle engine");
        this.engine = engine;
    }

    @Override
    public void setWheels(Wheel[] wheels) {
        if (wheels == null)
            throw new IllegalArgumentException("wheels cannot be null");
       if (wheels.length != 2)
           throw new IllegalArgumentException("a motorcycle needs 2 wheels");
       for (Wheel wheel : wheels)
           if (!(wheel instanceof MotorcycleWheel))
               throw new IllegalArgumentException("all wheels must be motorcycle wheels");
       this.wheels = wheels;
    }

    @Override
    public void setTires(Tire[] tires) {
        if (tires == null)
            throw new IllegalArgumentException("tires cannot be null");
        if (tires.length != 2)
            throw new IllegalArgumentException("a motorcycle needs 2 tires");
        for (Tire tire : tires)
            if (!(tire instanceof MotorcycleTire))
                throw new IllegalArgumentException("all tires must be motorcycle tires");
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
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
