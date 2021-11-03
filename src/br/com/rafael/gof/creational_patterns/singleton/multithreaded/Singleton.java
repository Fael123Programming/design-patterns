package br.com.rafael.gof.creational_patterns.singleton.multithreaded;

//This implementation could be used in a multithreaded environment.
public final class Singleton {
    private static volatile Singleton instance;
    //'volatile' means that this attribute can be accessed by multiple threads on memory without any problem.
    //It is used for synchronization among threads and to thread-safe a Java program.
    //If a thread modify it, this change will be visible by whatever other thread that access it thereafter.
    private final String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        //The approach taken here is Double-Checked Locking (DCL).
        Singleton local = instance;
        if (local != null) return local;
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

    public String getValue(){ return this.value; }
}
