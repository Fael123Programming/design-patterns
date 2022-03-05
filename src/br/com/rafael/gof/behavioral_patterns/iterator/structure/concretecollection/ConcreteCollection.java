package br.com.rafael.gof.behavioral_patterns.iterator.structure.concretecollection;

import br.com.rafael.gof.behavioral_patterns.iterator.structure.concreteiterator.ConcreteIterator;
import br.com.rafael.gof.behavioral_patterns.iterator.structure.iterablecollectioninterface.IterableCollection;
import br.com.rafael.gof.behavioral_patterns.iterator.structure.iteratorinterface.Iterator;

public class ConcreteCollection<T> implements IterableCollection<T> {
//    Of course, its whole code comes here...

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}
