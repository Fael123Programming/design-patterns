package br.com.rafael.gof.creational_patterns.prototype.java_internal_clone;

public class TestObject {
    private int number;
    private String string;

    public TestObject(int number, String string) {
        this.number = number;
        this.string = string;
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
    public TestObject clone() {
        return new TestObject(number, string);
    }

    @Override
    public String toString() {
        return "number: " + number + " string: " + string;
    }
}
