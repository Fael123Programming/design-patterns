package br.com.rafael.gof.creational_patterns.builder.ex05.composite.abstract_;

import java.math.BigDecimal;

public interface Item {
    BigDecimal getTotalPrice();

    String getDescription();
}
