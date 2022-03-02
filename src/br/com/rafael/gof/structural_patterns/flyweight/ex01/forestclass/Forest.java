package br.com.rafael.gof.structural_patterns.flyweight.ex01.forestclass;

import br.com.rafael.gof.structural_patterns.flyweight.ex01.contextclass.Tree;
import br.com.rafael.gof.structural_patterns.flyweight.ex01.flyweightfactory.TreeFactory;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Forest {
    private final List<Tree> trees;

    {
        this.trees = new ArrayList<>();
    }

    public void plantTree(String name, String color, String texture, int x, int y) {
        this.trees.add(new Tree(x, y, TreeFactory.getTreeType(name, color, texture)));
    }

    public void draw(Canvas canvas) {
        for (Tree tree : this.trees)
            tree.draw(canvas);
    }
}
