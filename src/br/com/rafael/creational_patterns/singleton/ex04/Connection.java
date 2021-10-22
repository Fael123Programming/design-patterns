package br.com.rafael.creational_patterns.singleton.ex04;

public class Connection {
    public static boolean hasOne = false;

    public Connection() throws Exception {
        if (hasOne) {
            throw new Exception("Illegal creation of a second instance for this class.");
        }
        hasOne = true;
    }

    public static Connection getInstance() throws Exception {
        return new Connection();
    }
}
