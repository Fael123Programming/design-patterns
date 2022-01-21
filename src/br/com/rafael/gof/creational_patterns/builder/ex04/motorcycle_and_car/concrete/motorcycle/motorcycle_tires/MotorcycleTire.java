package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.motorcycle.motorcycle_tires;

import br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.tire.Tire;

public class MotorcycleTire extends Tire {

    public MotorcycleTire(String brand, int size) {
        super(brand, "motorcycle tire");
        this.setSize(size);
    }

    @Override
    public void setSize(int size) {
        if (size >= 15)
            throw new IllegalArgumentException("tires must be of size < 15 for a motorcycle");
        this.size = size;
    }
}
