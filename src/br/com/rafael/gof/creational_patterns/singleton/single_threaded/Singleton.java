package br.com.rafael.gof.creational_patterns.singleton.single_threaded;

//This implementation is NON-THREAD-SAFE.
public final class Singleton { //The final modifier refrains a class of being inherited.
    private static Singleton instance; //The static modifier ensures us that this variable is unique in this class context.
    private String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000); //Slow initialization.
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
