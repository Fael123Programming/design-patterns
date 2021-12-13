package br.com.rafael.gof.structural_patterns.composite.ex03.composite;

import br.com.rafael.gof.structural_patterns.composite.ex03.interfaces.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Box implements Product {
    private final List<Product> products;

    {
        products = new ArrayList<>();
    }

    public void insert(Product newProduct) {
        products.add(newProduct);
    }

    public Product get(int index) {
        return products.get(index);
    }

    public Product remove(int index) {
        return products.remove(index);
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal finalPrice = BigDecimal.ZERO;
        for (Product p : products)
            finalPrice = finalPrice.add(p.getPrice());
        return finalPrice;
    }

    @Override
    public String inspect() {
        StringBuilder strBuilder = new StringBuilder("------- A box with -------");
        for (Product p : products)
            strBuilder.append("\n\t").append(p.inspect());
        strBuilder.append("\n--------------------------");
        return strBuilder.toString();
    }
}
