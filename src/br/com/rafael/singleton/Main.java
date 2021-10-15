package br.com.rafael.singleton;

import br.com.rafael.singleton.first_example.ConfigManager1;
import br.com.rafael.singleton.second_example.ConfigManager2;

public class Main {
    public static void main(String[] args) {
        System.out.println("###################################################################################");
        ConfigManager1 settings = ConfigManager1.getInstance();
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Memory location: " + settings);
        System.out.println("Server name: " + settings.getServerName());
        System.out.println("-----------------------------------------------------------------------------------");
        settings.setServerName("Server ADJ-1190");
        ConfigManager1 newSettings = ConfigManager1.getInstance();
        System.out.println("Memory location: " + newSettings); //It remains the same!-
        System.out.println("Server name: " + newSettings.getServerName());
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(newSettings == ConfigManager1.getInstance());
        //With the object itself we can call the method getInstance().
        //We will have the object calling a method that returns the memory address of itself.
        System.out.println("####################################################################################");
        ConfigManager2 settings2 = ConfigManager2.getInstance();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Memory location: " + settings2);
        System.out.println("Server name: " + settings2.getServerName());
        System.out.println("------------------------------------------------------------------------------------");
        settings2.setServerName("Server very crazy");
        ConfigManager2 newSettings2 = ConfigManager2.getInstance();
        System.out.println("Memory location: " + newSettings2);
        System.out.println("Server name: " + newSettings2.getServerName());
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(newSettings2 == ConfigManager2.getInstance());
    }
}
