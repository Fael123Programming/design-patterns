package br.com.rafael.gof.creational_patterns.singleton.multithreaded;

import br.com.rafael.gof.creational_patterns.singleton.single_threaded.Singleton;

public class TestSingleThreadedSingleton {
    public static void main(String[] args) {
        Thread newThread1 = new Thread(new SenderThread());
        Thread newThread2 = new Thread(new ReceiverThread());
        newThread1.start();
        newThread2.start();
        //These threads do not respect the singleton pattern applied.
        //Thread-lock must be used.
    }

    static class SenderThread implements Runnable {
        //A static class is a type of class which belongs only to this class and can be used as a complement of it
        //or a helper as to make validations on data and furthermore. It is an inner class of another enclosing one.
        @Override
        public void run() {
            Singleton single = Singleton.getInstance("SenderThread is that which commands it.");
            System.out.println(single.getValue());
        }
    }

    static class ReceiverThread implements Runnable {
        @Override
        public void run() {
            Singleton single = Singleton.getInstance("ReceiverThread is that one which controls this shit.");
            System.out.println(single.getValue());
        }
    }
}
