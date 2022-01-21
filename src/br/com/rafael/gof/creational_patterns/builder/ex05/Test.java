package br.com.rafael.gof.creational_patterns.builder.ex05;

import br.com.rafael.gof.creational_patterns.builder.ex05.builder.BoxBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex05.composite.concrete.Box;
import br.com.rafael.gof.creational_patterns.builder.ex05.composite.concrete.Product;

public class Test {
    public static void main(String[] args) {
        BoxBuilder bb = new BoxBuilder();
        bb.wrapInBox(new Product("Nike", "Super Shoes", 100));
        bb.wrapInBox(new Product("Apple", "Iphone X", 450));
        bb.addProduct(new Product("Shampoo", "Loreal Beauty", 20.5));
        Box products = bb.getResult();
        System.out.print(products.getDescription());
        System.out.print(products.getTotalPrice().doubleValue());
    }
}
