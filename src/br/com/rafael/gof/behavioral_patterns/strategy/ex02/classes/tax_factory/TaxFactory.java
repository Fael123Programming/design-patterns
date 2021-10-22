package br.com.rafael.gof.behavioral_patterns.strategy.ex02.classes.tax_factory;

import br.com.rafael.gof.behavioral_patterns.strategy.ex02.classes.taxes.*;
import br.com.rafael.gof.behavioral_patterns.strategy.ex02.interfaces.ITax;

import java.util.Locale;

public class TaxFactory { //Factory method with singleton!
    private static FederalTax fTax;
    private static StateTax sTax;
    private static CityTax cTax;

    private TaxFactory(){}

    public static ITax getInstance(String taxName) {
        ITax localTax;
        switch(taxName.toUpperCase()) {
            case "FEDERAL_TAX" -> {
                if (fTax == null) {
                    fTax = new FederalTax();
                }
                localTax = fTax;
            }
            case "STATE_TAX" -> {
                if (sTax == null) {
                    sTax = new StateTax();
                }
                localTax = sTax;
            }
            case "CITY_TAX" -> {
                if (cTax == null) {
                    cTax = new CityTax();
                }
                localTax = cTax;
            }
            default -> localTax = null;
        }
        return localTax;
    }
}
