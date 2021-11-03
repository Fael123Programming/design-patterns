package br.com.rafael.gof.creational_patterns.factory_method.ex02;

import br.com.rafael.gof.creational_patterns.factory_method.ex02.classes.Computer;
import br.com.rafael.gof.creational_patterns.factory_method.ex02.classes.DeviceFactory;
import br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces.Device;
import br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces.ScreenDevice;

public class Test {
    public static void main(String[] args) {
        Device dev = DeviceFactory.getInstance("computer", "Samsung", "Office X Z34");
        System.out.println(dev.getDeviceType());
        System.out.println(dev.getBrand());
        System.out.println(dev.getModel());
        System.out.println("---------------------------------------------------");
        while (dev.getVolume() < 100) dev.increaseVolume();
        System.out.println("Volume: " + dev.getVolume());
        while (dev.getVolume() > 0) dev.decreaseVolume();
        System.out.println("Volume: " + dev.getVolume());
        System.out.println("---------------------------------------------------");
        Computer comp = (Computer) dev;
        comp.playGame();
        comp.playMusic();
        while (comp.getBrightness() < 88) comp.increaseBrightness();
        System.out.println("Brightness: " + comp.getBrightness());
        System.out.println("Volume: " + comp.getVolume());
        ScreenDevice scrDev = (ScreenDevice) comp;
        scrDev.playMovie();
        Device rd = DeviceFactory.getInstance("RADIO", "Nokia", "TPC-77");
        useDevice(rd);
        rd.increaseVolume();
        rd.increaseVolume();
        rd.increaseVolume();
        System.out.println(rd.getVolume());
        System.out.println(rd.getDeviceType());
    }

    private static void useDevice(Device dev) {
        dev.playMusic();
    }
}
