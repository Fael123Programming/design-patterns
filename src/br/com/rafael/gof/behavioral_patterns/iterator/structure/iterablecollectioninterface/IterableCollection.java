package br.com.rafael.gof.behavioral_patterns.iterator.structure.iterablecollectioninterface;

import br.com.rafael.gof.behavioral_patterns.iterator.structure.iteratorinterface.Iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
