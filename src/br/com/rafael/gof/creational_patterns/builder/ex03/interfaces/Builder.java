package br.com.rafael.gof.creational_patterns.builder.ex03.interfaces;

// The Builder pattern can be applied when construction of various representations of
// the product involves similar steps that differ only in the details.

//The base builder interface defines all possible construction steps, and concrete
// builders implement these steps to construct particular representations of the product.
// Meanwhile, the director class guides the order of construction.

public interface Builder {
    void reset();

    void prepareMass();

    void putFilling();

    void putCream();

    void putSauce();
}
