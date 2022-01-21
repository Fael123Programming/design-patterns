package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.abstract_.tire;

public abstract class Tire {
    private String brand, model;
    protected int size;

    public Tire(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

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
        return "Tire{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}
