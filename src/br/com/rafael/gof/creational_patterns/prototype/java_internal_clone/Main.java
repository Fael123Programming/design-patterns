package br.com.rafael.gof.creational_patterns.prototype.java_internal_clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestObject testObj = new TestObject(90, "a string");
        TestObject aCopy = testObj.clone(); //clone() overridden from Object class.
        System.out.println("Source object -> " + testObj);
        System.out.println("Clone -> " + aCopy);
    }
}
