package br.com.rafael.gof.creational_patterns.factory_method.ex02.classes;

import br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces.Device;

public class Radio implements Device {
    private final String brand, model;
    private int volume;

    public Radio(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void playMusic(){
        System.out.println(this.brand + " " + this.model + " is playing music.");
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
    public String getBrand(){ return this.brand; }

    @Override
    public String getModel(){ return this.model; }

    @Override
    public String getDeviceType(){ return "Radio"; }
}
