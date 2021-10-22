package br.com.rafael.gof.behavioral_patterns.strategy.ex01;

import br.com.rafael.gof.behavioral_patterns.strategy.ex01.classes.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //------------------------------------------------------------------
        //Even though this is an application of strategy it is always preferred
        //that you hide instantiation of objects.
        //Check ex02 to see this change!
        //What we did there was an application of the factory method pattern.
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator(new Sum());
        double n1 = input.nextDouble(), n2 = input.nextDouble();
        System.out.println(n1 + " + " + n2 + " = " + calc.calculate(n1, n2));
        calc.setOperation(new Subtraction());
        System.out.println(n1 + " - " + n2 + " = " + calc.calculate(n1, n2));
        calc.setOperation(new Division());
        System.out.println(n1 + " / " + n2 + " = " + calc.calculate(n1, n2));
        calc.setOperation(new Multiplication());
        System.out.println(n1 + " * " + n2 + " = " + calc.calculate(n1, n2));
        calc.setOperation(new Exponentiation());
        System.out.println(n1 + " ^ " + n2 + " = " + calc.calculate(n1, n2));
        calc.setOperation(null);
        //--------------------------------------------------------------------
    }
}
