package br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile;

import java.util.*;

public class Profile {
    private final String name;
    private final String email;
    private final Map<String, List<String>> contacts;
    public static final String FRIEND = "friend", COWORKER = "coworker";

    {
        this.contacts = new HashMap<>();
        this.contacts.put(Profile.FRIEND, new ArrayList<>());
        this.contacts.put(Profile.COWORKER, new ArrayList<>());
    }

    public Profile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void addContact(String email, String contactType) {
        if (!this.contacts.containsKey(contactType))
            this.contacts.put(contactType, new ArrayList<>());
        this.contacts.get(contactType).add(email);
    }

    public void addContact(String email) {
        this.addContact(email, Profile.FRIEND);
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public List<String> getContacts(String contactType) {
        if (!this.contacts.containsKey(contactType))
            this.contacts.put(contactType, new ArrayList<>());
        return this.contacts.get(contactType);
    }
}
