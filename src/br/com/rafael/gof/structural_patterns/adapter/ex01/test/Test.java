package br.com.rafael.gof.structural_patterns.adapter.ex01.test;

import br.com.rafael.gof.structural_patterns.adapter.ex01.concrete_classes.adapter.Adapter;
import br.com.rafael.gof.structural_patterns.adapter.ex01.concrete_classes.service.Service;
import br.com.rafael.gof.structural_patterns.adapter.ex01.interfaces.ClientInterface;

import javax.swing.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        businessLogic(new Adapter(new Service())); //Using our Adapter we can communicate with our service!!!
        businessLogic((data) -> new Service().serviceMethod(data)); //Lambda expression!
//        Creating a class, implementing the interface ClientInterface and its method and calling it.
//        This can be done only with functional interfaces (one-method interface) my fellow!
//        Without our adapter, things get crazy!
    }

    private static void businessLogic(ClientInterface inter) {
        System.out.println(Arrays.toString(inter.getSomething(JOptionPane.showInputDialog("Enter a message"))));
    }
}
