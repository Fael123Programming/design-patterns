package br.com.rafael.gof.creational_patterns.singleton.single_threaded;

public class Test {
    public static void main(String[] args) {
        Singleton single = Singleton.getInstance("Whatever");
        System.out.println(single.getValue() + " " + single);
        single.setValue("Data base was stolen.");
        Singleton another = Singleton.getInstance("This string will not take any affect");
        System.out.println(another.getValue() + " " + another);
    }
}
