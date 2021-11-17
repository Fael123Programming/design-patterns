package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.director;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.builders.CommonHouseBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.builders.HighHouseBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.builders.ModernHouseBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex01.interfaces.Builder;

public class Director {
    public void buildCommonHouse(Builder builder) {
        if(!(builder instanceof CommonHouseBuilder))
            throw new IllegalArgumentException("Builder must be of common houses");
        builder.buildStep1();
        builder.buildStep2();
        builder.buildStep3();
    }

    public void buildModernHouse(Builder builder) {
        if (!(builder instanceof ModernHouseBuilder))
            throw new IllegalArgumentException("Builder must be of modern houses");
        builder.buildStep1();
        builder.buildStep2();
        builder.buildStep3();
    }

    public void buildHighHouse(Builder builder) {
        if (!(builder instanceof HighHouseBuilder))
            throw new IllegalArgumentException("Builder must be of high houses");
        builder.buildStep1();
        builder.buildStep2();
        builder.buildStep3();
    }
}
