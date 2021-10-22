package br.com.rafael.gof.creational_patterns.singleton.ex01;

//Singleton pattern: only one object is permitted for a class.

public class ConfigManager1 {
    //'instance' must be static because we want only one instance to be instantiated.
    //This object is created during class load time.
    private final static ConfigManager1 instance = new ConfigManager1();
    private String serverName; //This attribute belongs only to 'instance'.

    private ConfigManager1(){} //No objects for you!

    //This method must be static because we will access it through the class itself.
    public static ConfigManager1 getInstance() {
        return ConfigManager1.instance;
    }

    //These methods below are supposed to be used only by 'instance'.
    public String getServerName(){
        return this.serverName;
    }

    public void setServerName(String newServerName) {
        this.serverName = newServerName;
    }
}
