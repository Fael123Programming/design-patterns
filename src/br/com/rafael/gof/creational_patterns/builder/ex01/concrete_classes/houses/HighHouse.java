package br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.houses;

import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.Floor;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.Garden;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.Pool;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.construction_elements.Roof;
import br.com.rafael.gof.creational_patterns.builder.ex01.concrete_classes.enums.Color;

public class HighHouse {
    private ModernHouse modernHouse;
    private Pool pool;

    public HighHouse(Roof roof, Floor floor, Color externalColor, Garden garden, Pool pool) {
        this.modernHouse = new ModernHouse(roof, floor, externalColor, garden);
        this.pool = pool;
    }

    public HighHouse(){
        modernHouse = new ModernHouse();
    }

    public ModernHouse getModernHouse() {
        return modernHouse;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    @Override
    public String toString() {
        return "HighHouse{" +
                "modernHouse=" + modernHouse +
                ", pool=" + pool +
                '}';
    }
}
