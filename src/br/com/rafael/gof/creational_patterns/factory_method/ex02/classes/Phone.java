package br.com.rafael.gof.creational_patterns.factory_method.ex02.classes;

import br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces.Device;
import br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces.ScreenDevice;

public class Phone implements Device, ScreenDevice {
    private final String brand, model;
    private int volume, brightness;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void playMusic() {
        System.out.println(this.brand + " " + this.model + " is playing music.");
    }

    @Override
    public void playMovie() {
        System.out.println(this.brand + " " + this.model + " is playing movie.");
    }

    @Override
    public void playGame() {
        System.out.println(this.brand + " " + this.model + " is playing game.");
    }

    @Override
    public void increaseBrightness(){
        if (this.brightness < 100) this.brightness++;
    }

    @Override
    public void decreaseBrightness(){
        if (this.brightness > 0) this.brightness--;
    }

    @Override
    public void increaseVolume(){
        if (this.volume < 100) this.volume++;
    }

    @Override
    public void decreaseVolume(){
        if (this.volume > 0) this.volume--;
    }

    @Override
    public int getVolume(){ return this.volume; }

    @Override
    public int getBrightness(){ return this.brightness; }

    @Override
    public String getBrand(){ return this.brand; }

    @Override
    public String getModel(){ return this.model; }

    @Override
    public String getDeviceType(){ return "Phone"; }
}
