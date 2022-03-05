package br.com.rafael.gof.behavioral_patterns.iterator.structure.concreteiterator;

import br.com.rafael.gof.behavioral_patterns.iterator.structure.collectionelement.Element;
import br.com.rafael.gof.behavioral_patterns.iterator.structure.concretecollection.ConcreteCollection;
import br.com.rafael.gof.behavioral_patterns.iterator.structure.iteratorinterface.Iterator;

public class ConcreteIterator<T> implements Iterator<T> {
    private final ConcreteCollection<T> collection;
    private String iterationState;

    public ConcreteIterator(ConcreteCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public Element<T> getNext() {
        return new Element<>();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

}
