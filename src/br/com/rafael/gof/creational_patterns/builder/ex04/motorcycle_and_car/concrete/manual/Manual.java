package br.com.rafael.gof.creational_patterns.builder.ex04.motorcycle_and_car.concrete.manual;

public class Manual {
    private String info;

    public Manual(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        if (info == null || info.isBlank())
            throw new IllegalArgumentException("info cannot be null or blank");
        this.info = info;
    }

    public String toString() {
        return this.info;
    }
}
