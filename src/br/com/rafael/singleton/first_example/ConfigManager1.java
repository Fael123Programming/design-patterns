package br.com.rafael.singleton.first_example;

//Singleton pattern: only one object is required for a class.

public class ConfigManager1 {
    //'instance' must be static because we want only one instance to be instantiated.
    //This object is created during loading time of the class.
    private static ConfigManager1 instance = new ConfigManager1();
    private String serverName;

    private ConfigManager1(){} //No objects for you!

    //This method must be static because we will access it through the class itself.
    public static ConfigManager1 getInstance() {
        return ConfigManager1.instance;
    }

    //These methods below are supposed to be used only by an object of ConfigManager1.
    public String getServerName(){
        return this.serverName;
    }

    public void setServerName(String newServerName) {
        this.serverName = newServerName;
    }
}
