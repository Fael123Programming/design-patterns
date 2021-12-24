package br.com.rafael.gof.structural_patterns.composite.ex03;

import br.com.rafael.gof.structural_patterns.composite.ex03.composite.Box;
import br.com.rafael.gof.structural_patterns.composite.ex03.leaves.TShirt;
import br.com.rafael.gof.structural_patterns.composite.ex03.leaves.Trouser;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Composite pattern is very handy");
        Box boxOfTShirts = new Box();
        boxOfTShirts.insert(new TShirt(new BigDecimal("200.49")));
        boxOfTShirts.insert(new TShirt(new BigDecimal("400")));
        boxOfTShirts.insert(new TShirt(new BigDecimal("50")));
        Box boxOfTrousers = new Box();
        boxOfTrousers.insert(new Trouser(new BigDecimal("20.50")));
        boxOfTrousers.insert(new Trouser(new BigDecimal("99.90")));
        boxOfTrousers.insert(new Trouser(new BigDecimal("40")));
        Box aBiggerBox = new Box();
        aBiggerBox.insert(new TShirt(new BigDecimal("1000")));
        aBiggerBox.insert(boxOfTShirts);
        aBiggerBox.insert(boxOfTrousers);
        System.out.println(aBiggerBox.getPrice());
        System.out.println(aBiggerBox.inspect());
//      aBiggerBox contains: a free t-shirt and two smaller boxes, respectively, a box of t-shirts and another of trousers.
    }
}
