package br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces;

public interface Device {
    default void turnOn() {
        System.out.println("Device is turned on.");
    }

    default void turnOff(){
        System.out.println("Device is turned off.");
    }

    void playMusic();

    void increaseVolume();

    void decreaseVolume();

    int getVolume();

    String getBrand();

    String getModel();

    String getDeviceType();
}
