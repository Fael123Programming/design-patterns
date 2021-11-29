package br.com.rafael.gof.structural_patterns.bridge.ex02.abstract_classes;

import br.com.rafael.gof.structural_patterns.bridge.ex02.interfaces.Implementable;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementable obj) {
        super(obj);
    }

    public void featureN(){
//        Do something further than its parent...
//        super.getObject().methodN();
//        ...
    }
}
