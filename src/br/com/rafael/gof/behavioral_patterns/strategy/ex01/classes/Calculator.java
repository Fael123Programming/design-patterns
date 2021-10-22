package br.com.rafael.gof.behavioral_patterns.strategy.ex01.classes;

import br.com.rafael.gof.behavioral_patterns.strategy.ex01.interfaces.IOperation;

//Strategy uses interface reference variables to generalize functionality and behaviour
//of different algorithms that are working together in the application.

public class Calculator {
    private IOperation op;

    public Calculator(IOperation op) { //Demands you an initial operation to be used.
        this.op = op;
    }

    public double calculate(double op1, double op2) {
        return this.op.calculate(op1 , op2); //It does not matter how op calculate...
    }

    public IOperation getOperation(){
        return this.op;
    }

    public void setOperation(IOperation newOp) {
        if (newOp == null) throw new IllegalArgumentException("Operation cannot be null");
        this.op = newOp;
    }
}
