package br.com.rafael.gof.structural_patterns.adapter.ex02.adapter;

//In this example, the adapter will inherit the service object instead of
//wrapping it.

import br.com.rafael.gof.structural_patterns.adapter.ex01.concrete_classes.service.Service;
import br.com.rafael.gof.structural_patterns.adapter.ex01.interfaces.ClientInterface;

public class Adapter extends Service implements ClientInterface {
    @Override
    public char[] getSomething(String data) {
        return serviceMethod(convertToServiceFormat(data));
    }

    private String convertToServiceFormat(String data) {
        return data.toUpperCase();
    }
}
