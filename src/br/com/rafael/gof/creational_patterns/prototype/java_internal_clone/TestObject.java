package br.com.rafael.gof.creational_patterns.prototype.java_internal_clone;

public class TestObject implements Cloneable {
    private int number;
    private String string;

    public TestObject(int number, String string) {
        this.number = number;
        this.string = string;
    }

    public TestObject(TestObject prototype) {
        this.number = prototype.number;
        this.string = prototype.string;
    }

    public int getNumber() {
        return number;
    }

    public String getString() {
        return string;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public TestObject clone() throws CloneNotSupportedException {
//        If we can throw a CloneNotSupportedException if we want.
        Object clone = super.clone();
//        All data is copied already!
        return (TestObject) clone;
    }

    @Override
    public String toString() {
        return "number: " + number + " string: " + string;
    }
}
