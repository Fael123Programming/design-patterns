package br.com.rafael.gof.structural_patterns.composite.ex03.leaves;

import br.com.rafael.gof.structural_patterns.composite.ex03.interfaces.Product;
import java.math.BigDecimal;

public class TShirt implements Product {
    private final BigDecimal price;
    //Attributes of a t-shirt...

    public TShirt(BigDecimal price) {
        this.price = price;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String inspect(){
        return "A T-shirt";
    }
}
