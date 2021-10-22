package br.com.rafael.gof.behavioral_patterns.strategy.ex02;

import br.com.rafael.gof.behavioral_patterns.strategy.ex02.classes.tax_calculator.TaxCalculator;
import br.com.rafael.gof.behavioral_patterns.strategy.ex02.exceptions.InvalidTaxNameException;

public class Test {
    public static void main(String[] args) {
        try {
            TaxCalculator tCalc = new TaxCalculator("STATE_TAX");
            System.out.println("Calculating STATE_TAX over $2000: $" + tCalc.calculate(2000));
            System.out.println("Calculating CITY_TAX over $2000: $" + tCalc.calculate("CITY_TAX", 2000));
            tCalc.setTax("FEDERAL_TAX"); //New object to the attribute tax.
            System.out.println("Calculating FEDERAL_TAX over $2000: $" + tCalc.calculate(2000));
        }catch(InvalidTaxNameException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            TaxCalculator tCalc2 = new TaxCalculator("city_tax");
            System.out.println("CITY_TAX over $40,000,000 would be $" + tCalc2.calculate(40000000));
        }catch(InvalidTaxNameException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
