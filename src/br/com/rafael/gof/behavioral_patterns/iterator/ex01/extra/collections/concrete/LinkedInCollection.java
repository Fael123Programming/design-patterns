package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.concrete;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.abstract_.SocialNetwork;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.concrete.LinkedInIterator;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.abstract_.ProfileIterator;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.networkconnector.NetworkConnector;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile.Profile;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profilesearcher.ProfileSearcher;

import java.util.List;
import java.util.ArrayList;

public class LinkedInCollection implements SocialNetwork {
    private final List<Profile> profiles;

    public LinkedInCollection(List<Profile> profiles) {
        this.profiles = profiles == null ? new ArrayList<>() : profiles;
    }

    public Profile requestProfileFromLinkedIn(String profileEmail) {
        new NetworkConnector().connect();
        System.out.println("LinkedIn: loading profile '" + profileEmail + "' over the network...");
        return ProfileSearcher.doSearch(this.profiles, profileEmail);
    }

    public List<String> requestProfileFriendsFromLinkedIn(String profileEmail, String contactType) {
        new NetworkConnector().connect();
        System.out.println("LinkedIn: loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
        Profile profile = ProfileSearcher.doSearch(this.profiles, profileEmail);
        return profile == null ? null : profile.getContacts(contactType);
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, Profile.FRIEND, profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, Profile.COWORKER, profileEmail);
    }
}
