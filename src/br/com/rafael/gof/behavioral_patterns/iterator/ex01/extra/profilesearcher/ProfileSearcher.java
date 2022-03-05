package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profilesearcher;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile.Profile;

import java.util.List;

public class ProfileSearcher {
    public static Profile doSearch(List<Profile> profileList, String profileEmail) {
        for (Profile profile : profileList)
            if (profile.getEmail().equals(profileEmail))
                return profile;
        return null;
    }
}
