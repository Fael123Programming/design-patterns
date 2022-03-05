package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.concrete;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.concrete.LinkedInCollection;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.abstract_.ProfileIterator;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedInIterator implements ProfileIterator {
    private final LinkedInCollection lic;
    private final String type, email;
    private int currentPosition;
    private final List<String> emails;
    private final List<Profile> contacts;

    {
        this.emails = new ArrayList<>();
        this.contacts = new ArrayList<>();
    }

    public LinkedInIterator(LinkedInCollection lic, String type, String email) {
        this.lic = lic;
        this.type = type;
        this.email = email;
    }

    public void lazyLoad() {
        if (this.emails.isEmpty()) {
            List<String> emailsOfFriends = this.lic.requestProfileFriendsFromLinkedIn(this.email, this.type);
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
            friendProfile = this.lic.requestProfileFromLinkedIn(friendEmail);
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
