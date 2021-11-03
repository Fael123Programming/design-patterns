package br.com.rafael.gof.creational_patterns.singleton.ex02;

public class ConfigManager2 {
    private static ConfigManager2 instance;
    private String serverName; //It belongs to 'instance' only.

    private ConfigManager2(){}

    //Lazy instantiation of the object with synchronization among threads that could be using this very class.
    public static synchronized ConfigManager2 getInstance(){ //Static creation method instead a traditional constructor.
        if (instance == null) {
            instance = new ConfigManager2();
        }
        return instance;
    }

    public String getServerName(){
        return this.serverName;
    } //It belongs to 'instance' only.

    public void setServerName(String newServerName) {
        this.serverName = newServerName;
    } //It belongs to 'instance' only.
}
