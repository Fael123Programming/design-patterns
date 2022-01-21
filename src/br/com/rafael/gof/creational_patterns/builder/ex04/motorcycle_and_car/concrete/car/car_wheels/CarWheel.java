package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.car.car_wheels;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.wheel.Wheel;

public class CarWheel extends Wheel {

    public CarWheel(String brand, int size) {
        super(brand, "car wheel");
        this.setSize(size);
    }

    @Override
    public void setSize(int size) {
        if (size < 15)
            throw new IllegalArgumentException("wheel size must be >= 15 for a car");
        this.size = size;
    }
}
