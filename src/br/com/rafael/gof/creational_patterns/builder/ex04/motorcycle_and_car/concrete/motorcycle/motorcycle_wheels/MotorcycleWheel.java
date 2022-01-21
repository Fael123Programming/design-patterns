package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_wheels;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.wheel.Wheel;

public class MotorcycleWheel extends Wheel {

    public MotorcycleWheel(String brand, int size) {
        super(brand, "Motorcycle wheel");
        this.setSize(size);
    }

    @Override
    public void setSize(int size) {
        if (size >= 15)
            throw new IllegalArgumentException("wheel size must be < 15 for a motorcycle");
        this.size = size;
    }
}
