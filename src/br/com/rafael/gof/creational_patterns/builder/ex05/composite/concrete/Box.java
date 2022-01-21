package br.com.rafael.gof.creational_patterns.builder.ex05.composite.concrete;

import br.com.rafael.gof.creational_patterns.builder.ex05.composite.abstract_.Item;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Box implements Item {
    private final List<Item> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Item removeItem(int index) {
        if (index < 0 || index >= this.items.size())
            throw new IllegalArgumentException("index " + index + " invalid for size " + this.items.size());
        return this.items.remove(index);
    }

    @Override
    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Item item : this.items)
            totalPrice = totalPrice.add(item.getTotalPrice());
        return totalPrice;
    }

    @Override
    public String getDescription() {
        if (this.items.isEmpty())
            return "Empty box";
        StringBuilder description = new StringBuilder("A box\n");
        for (Item item : this.items)
            description.append(item.getDescription()).append("\n");
        return description.toString();
    }

}
