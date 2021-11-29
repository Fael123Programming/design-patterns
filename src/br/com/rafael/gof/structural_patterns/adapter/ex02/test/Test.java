package br.com.rafael.gof.structural_patterns.adapter.ex02.test;

import br.com.rafael.gof.structural_patterns.adapter.ex01.interfaces.ClientInterface;
import br.com.rafael.gof.structural_patterns.adapter.ex02.adapter.Adapter;

import javax.swing.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Here we are using inheritance instead of object composition between the adapter and the service object.
        businessLogic((data) -> (new Adapter()).getSomething(data));
    }

    private static void businessLogic(ClientInterface inter) {
        System.out.println(Arrays.toString(inter.getSomething(JOptionPane.showInputDialog("Enter a message"))));
    }
}
