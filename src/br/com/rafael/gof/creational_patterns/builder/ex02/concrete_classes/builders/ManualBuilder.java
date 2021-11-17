package br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.builders;

import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.car_items.engines.Engine;
import br.com.rafael.gof.creational_patterns.builder.ex02.interfaces.Builder;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.manual.Manual;

public class ManualBuilder implements Builder {
    private Manual manual;

    public ManualBuilder() {
        reset();
    }
    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int quantity) {
        manual.setAboutSeats("This car is provided with " + quantity + " seats to be used.");
    }

    @Override
    public void setEngine(Engine newEngine) {
        manual.setAboutEngine("This car's engine information: " + newEngine);
    }

    @Override
    public void setTripComputer() {
        manual.setAboutTripComp("This car's own trip computer information");
    }

    @Override
    public void setGPS() {
        manual.setAboutGPS("This car's own GPS information");
    }

    public Manual getResult() {
        Manual localManual = manual;
        reset();
        return localManual;
    }
}
