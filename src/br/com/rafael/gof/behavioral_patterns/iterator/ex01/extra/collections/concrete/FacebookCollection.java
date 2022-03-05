package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.concrete;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.abstract_.SocialNetwork;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.concrete.FacebookIterator;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.networkconnector.NetworkConnector;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile.Profile;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profilesearcher.ProfileSearcher;

import java.util.ArrayList;
import java.util.List;

public class FacebookCollection implements SocialNetwork {
    private final List<Profile> profiles;

    public FacebookCollection(List<Profile> profiles) {
        this.profiles = profiles == null ? new ArrayList<>() : profiles;
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        new NetworkConnector().connect();
        System.out.println("Facebook: loading profile '" + profileEmail + "' over the network...");
        return ProfileSearcher.doSearch(this.profiles, profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        new NetworkConnector().connect();
        System.out.println("Facebook: loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
        Profile profile = ProfileSearcher.doSearch(this.profiles, profileEmail);
        return profile == null ? null : profile.getContacts(contactType);
    }

    @Override
    public FacebookIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, Profile.FRIEND, profileEmail);
    }

    @Override
    public FacebookIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, Profile.COWORKER, profileEmail);
    }
}
