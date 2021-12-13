package br.com.rafael.gof.structural_patterns.composite.ex03.leaves;

import br.com.rafael.gof.structural_patterns.composite.ex03.interfaces.Product;
import java.math.BigDecimal;

public class Trouser implements Product {
    private final BigDecimal price;
    //Attributes of a trouser...

    public Trouser(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String inspect() {
        return "A trouser";
    }
}
