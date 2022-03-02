package br.com.rafael.gof.structural_patterns.flyweight.ex01.flyweightfactory;

import br.com.rafael.gof.structural_patterns.flyweight.ex01.flyweightclass.TreeType;

import java.util.Objects;
import java.util.TreeMap;

//Flyweight factory decides whether to re-use existing
//flyweight or to create a new object.
public class TreeFactory {
    private static final TreeMap<Integer, TreeType> treeTypeContainer;

    static {
        treeTypeContainer = new TreeMap<>();
    }

    public static TreeType getTreeType(String name, String color, String texture) {
        int treeTypeHash = Objects.hash(name, color, texture);
        TreeType wantedTreeType = treeTypeContainer.get(treeTypeHash);
        if (wantedTreeType == null)
            treeTypeContainer.put(treeTypeHash, wantedTreeType = new TreeType(name, color, texture));
        return wantedTreeType;
    }
}
