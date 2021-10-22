package br.com.rafael.gof.creational_patterns.singleton.ex04;

public class Test {
    public static void main(String[] args) {
        try {
            Connection con = new Connection();
        }catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
        try {
            Connection con2 = Connection.getInstance();
        }catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
