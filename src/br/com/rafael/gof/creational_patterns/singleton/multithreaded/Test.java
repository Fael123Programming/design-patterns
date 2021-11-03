package br.com.rafael.gof.creational_patterns.singleton.multithreaded;

public class Test {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
    }
    static class Thread1 extends Thread {
        @Override
        public void run() {
            Singleton single = Singleton.getInstance("Thread1 has been reached.");
            System.out.println(single.getValue());
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            Singleton single = Singleton.getInstance("Thread2 has been reached");
            System.out.println(single.getValue());
        }
    }
}
