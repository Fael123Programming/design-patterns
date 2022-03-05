package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.socialspammer;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.iterators.abstract_.ProfileIterator;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.abstract_.SocialNetwork;

import java.util.Objects;

public class SocialSpammer {
    private final SocialNetwork socialNetwork;
    private ProfileIterator friendsIterator, coworkersIterator;

    public SocialSpammer(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("Iterating over friends of '" + profileEmail + "'...");
        if (this.friendsIterator == null)
            this.friendsIterator = this.socialNetwork.createFriendsIterator(profileEmail);
        while (this.friendsIterator.hasNext())
            this.sendMessageToEmail(profileEmail, this.friendsIterator.getNext().getEmail(), message);
        this.friendsIterator.reset();
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("Iterating over coworkers of '" + profileEmail + "'...");
        if (this.coworkersIterator == null)
            this.coworkersIterator = this.socialNetwork.createCoworkersIterator(profileEmail);
        while (this.coworkersIterator.hasNext())
            this.sendMessageToEmail(profileEmail, this.coworkersIterator.getNext().getEmail(), message);
        this.coworkersIterator.reset();
    }

    private void sendMessageToEmail(String senderEmail, String receiverEmail, String content) {
        System.out.println("Message " + Objects.hash(content) + " sent from '" + senderEmail + "' to '" + receiverEmail + "'");
    }
}
