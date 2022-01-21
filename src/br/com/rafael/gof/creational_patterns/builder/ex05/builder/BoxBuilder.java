package br.com.rafael.gof.creational_patterns.builder.ex05.builder;

import br.com.rafael.gof.creational_patterns.builder.ex05.composite.concrete.Box;
import br.com.rafael.gof.creational_patterns.builder.ex05.composite.concrete.Product;

public class BoxBuilder {
    private Box box;

    public BoxBuilder() {
        this.reset();
    }

    public void reset() {
        this.box = new Box();
    }

    public void wrapInBox(Product... products) {
        if (products == null)
            throw new IllegalArgumentException("products cannot be null");
        if (products.length == 0)
            throw new IllegalArgumentException("products cannot be empty");
        for (Product p : products)
            if (p == null)
                throw new IllegalArgumentException("products cannot be null");
        Box box = new Box();
        for (Product p : products)
            box.addItem(p);
        this.box.addItem(box);
    }

    public void addProduct(Product product) {
        this.box.addItem(product);
    }

    public Box getResult() {
        Box box = this.box;
        this.reset();
        return box;
    }
}
