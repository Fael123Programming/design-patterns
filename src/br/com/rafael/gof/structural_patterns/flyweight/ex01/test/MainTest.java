package br.com.rafael.gof.structural_patterns.flyweight.ex01.test;

import br.com.rafael.gof.structural_patterns.flyweight.ex01.flyweightclass.TreeType;
import br.com.rafael.gof.structural_patterns.flyweight.ex01.flyweightfactory.TreeFactory;

public class MainTest {
    public static void main(String[] args) {
        TreeType type1 = TreeFactory.getTreeType("tree type 1", "brown", "texture 1");
        System.out.println(type1);
        System.out.println(type1.hashCode());
        System.out.println("---------------------------------------");
        TreeType type1Again = TreeFactory.getTreeType("tree type 1", "brown", "texture 1");
        System.out.println(type1Again);
        System.out.println(type1Again.hashCode());
        System.out.println(type1.equals(type1Again));
    }
}
