package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.concrete;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.concrete.FacebookCollection;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.abstract_.ProfileIterator;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile.Profile;

import java.util.List;
import java.util.ArrayList;

public class FacebookIterator implements ProfileIterator {
    private final FacebookCollection fc;
    private final String type, email;
    private int currentPosition;
    private final List<String> emails;
    private final List<Profile> contacts;

    {
        this.emails = new ArrayList<>();
        this.contacts = new ArrayList<>();
    }

    public FacebookIterator(FacebookCollection fc, String type, String email) {
        this.fc = fc;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (this.emails.isEmpty()) {
            List<String> emailsOfFriends = this.fc.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String email : emailsOfFriends) {
                this.emails.add(email);
                this.contacts.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        this.lazyLoad();
        return this.currentPosition < this.emails.size();
    }

    @Override
    public Profile getNext() {
        if (!this.hasNext())
            return null;
        String friendEmail = this.emails.get(this.currentPosition);
        Profile friendProfile = this.contacts.get(this.currentPosition);
        if (friendProfile == null) {
            friendProfile = this.fc.requestProfileFromFacebook(friendEmail);
            this.contacts.add(this.currentPosition, friendProfile);
        }
        this.currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        if (this.currentPosition > 0)
            this.currentPosition = 0;
    }
}
