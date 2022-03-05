package br.com.rafael.gof.behavioral_patterns.iterator.structure.collectionelement;

public class Element<T> {
    // A member of a collection.
    private T data;

    public Element(T data) {
        this.data = data;
    }

    public Element() {}

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
