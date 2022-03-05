package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.abstract_;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.abstract_.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
