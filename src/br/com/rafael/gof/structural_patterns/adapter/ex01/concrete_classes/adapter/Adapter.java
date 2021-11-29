package br.com.rafael.gof.structural_patterns.adapter.ex01.concrete_classes.adapter;

import br.com.rafael.gof.structural_patterns.adapter.ex01.concrete_classes.service.Service;
import br.com.rafael.gof.structural_patterns.adapter.ex01.interfaces.ClientInterface;

//This is the adapter.
//It must wrap the target object (The object the client code wants to talk with).

public class Adapter implements ClientInterface {
    private Service targetObject; //Target object.

    public Adapter(Service targetObject) {
        this.targetObject = targetObject;
    }

    public Service getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Service targetObject) {
        this.targetObject = targetObject;
    }

    private String convertToServiceFormat(String data) {
        return data.toUpperCase(); //Trivial example!
//        It does the data translation process between the objects in communication.
    }

    @Override
    public char[] getSomething(String data) {
        return targetObject.serviceMethod(this.convertToServiceFormat(data));
    }
}
