package br.com.rafael.gof.creational_patterns.builder.ex05.composite.concrete;

import br.com.rafael.gof.creational_patterns.builder.ex05.composite.abstract_.Item;
import java.math.BigDecimal;
import java.util.Locale;
import java.text.NumberFormat;

public class Product implements Item {
    private String brand, name;
    private BigDecimal price;

    public Product(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = BigDecimal.valueOf(price);
    }

    @Override
    public String getDescription() {
        return "product=" + this.name + ", brand=" + this.brand + ", price=" +
                NumberFormat.getCurrencyInstance(Locale.getDefault()).format(this.price.doubleValue());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
