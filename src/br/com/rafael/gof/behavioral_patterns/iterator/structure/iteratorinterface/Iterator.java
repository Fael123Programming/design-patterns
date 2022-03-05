package br.com.rafael.gof.behavioral_patterns.iterator.structure.iteratorinterface;

import br.com.rafael.gof.behavioral_patterns.iterator.structure.collectionelement.Element;

public interface Iterator<T> {
    Element<T> getNext();

    boolean hasNext();
//  And further useful methods...
}
