package br.com.rafael.gof.creational_patterns.factory_method.ex02.classes;

import br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces.Device;

public class DeviceFactory {

    public static Device getInstance(String deviceType, String brand, String model) {
        return switch(deviceType.toUpperCase()) {
            case "PHONE" -> new Phone(brand, model);
            case "COMPUTER" -> new Computer(brand, model);
            case "TV" -> new Tv(brand, model);
            case "RADIO" -> new Radio(brand, model);
            default -> null;
        };
    }
}
