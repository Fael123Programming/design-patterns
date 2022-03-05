package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.abstract_;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
