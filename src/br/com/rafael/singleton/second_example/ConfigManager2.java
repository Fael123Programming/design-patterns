package br.com.rafael.singleton.second_example;

public class ConfigManager2 {
    private static ConfigManager2 instance;
    private String serverName;

    private ConfigManager2(){}

    //Lazy instantiation of the object with synchronization among threads that could be using this very class.
    public static synchronized ConfigManager2 getInstance(){
        if (instance == null) {
            instance = new ConfigManager2();
        }
        return instance;
    }

    public String getServerName(){
        return this.serverName;
    }

    public void setServerName(String newServerName) {
        this.serverName = newServerName;
    }
}
