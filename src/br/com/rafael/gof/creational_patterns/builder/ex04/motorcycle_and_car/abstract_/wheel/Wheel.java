package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.wheel;

public abstract class Wheel {
    private String brand, model;
    protected int size;

    public Wheel(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Wheel() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public abstract void setSize(int size);

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}
