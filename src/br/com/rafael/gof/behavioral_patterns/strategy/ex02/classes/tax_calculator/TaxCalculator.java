package br.com.rafael.gof.behavioral_patterns.strategy.ex02.classes.tax_calculator;

import br.com.rafael.gof.behavioral_patterns.strategy.ex02.classes.tax_factory.TaxFactory;
import br.com.rafael.gof.behavioral_patterns.strategy.ex02.exceptions.InvalidTaxNameException;
import br.com.rafael.gof.behavioral_patterns.strategy.ex02.interfaces.ITax;

public class TaxCalculator {
    private ITax tax;

    public TaxCalculator(String taxName) throws InvalidTaxNameException {
        this.tax = TaxFactory.getInstance(taxName);
        if (this.tax == null) throw new InvalidTaxNameException();
    }

    public double calculate(String taxName, double balance) throws InvalidTaxNameException {
        //Uses another tax than that already initialized in the attribute tax.
        ITax localTax = TaxFactory.getInstance(taxName);
        if (localTax == null) {
            throw new InvalidTaxNameException();
        }
        return localTax.calculateTax(balance);
    }

    public double calculate(double balance) {
        return this.tax.calculateTax(balance); //Uses the attribute tax.
    }

    public void setTax(String taxName) throws InvalidTaxNameException {
        ITax localTax = TaxFactory.getInstance(taxName);
        if (localTax == null) {
            throw new InvalidTaxNameException();
        }
        this.tax = localTax;
    }
}
