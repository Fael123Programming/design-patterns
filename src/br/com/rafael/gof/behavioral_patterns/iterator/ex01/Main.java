package br.com.rafael.gof.behavioral_patterns.iterator.ex01;

import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.abstract_.SocialNetwork;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.concrete.FacebookCollection;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.collections.concrete.LinkedInCollection;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.profile.Profile;
import br.com.rafael.gof.behavioral_patterns.iterator.ex01.extra.socialspammer.SocialSpammer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please specify social network to target spam tool (default: Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        System.out.println("3. Exit");
        int choice;
        try {
            choice = input.nextInt();
        } catch(InputMismatchException ignore) {
            choice = 1;
        }
        SocialNetwork network = switch(choice) {
            case 2 -> new LinkedInCollection(Main.createTestProfiles());
            case 3 -> null;
            default -> new FacebookCollection(Main.createTestProfiles());
        };
        if (network == null)
            return;
        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToCoworkers("rafael_fonseca@amazon.com", "Hey, this is Rafael! Throw a " +
                "bomb on Putin's headquarters to stop the war...");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> testProfiles = new ArrayList<>();
        Profile lordRafael = new Profile("Rafael Fonseca", "rafael_fonseca@amazon.com");
        Profile p1 = new Profile("Jorge Simons", "jorge_simons@microsoft.com");
        Profile p2 = new Profile("Marinna Matthew", "marinna_matthew@google.com");
        Profile p3 = new Profile("Cristina Alves", "cristina_alves@amazon.com");
        Profile p4 = new Profile("Sam", "sam@amazon.com");
        Profile p5 = new Profile("Anna Smith", "anna.smith@bing.com");
        Profile p6 = new Profile("Selina Kyle", "catwoman@yahoo.com");
        Profile p7 = new Profile("Mad Max", "mad_max@youtube.com");
        lordRafael.addContact(p1.getEmail());
        lordRafael.addContact(p2.getEmail());
        lordRafael.addContact(p3.getEmail(), Profile.COWORKER);
        lordRafael.addContact(p4.getEmail(), Profile.COWORKER);
        lordRafael.addContact(p5.getEmail());
        lordRafael.addContact(p6.getEmail());
        lordRafael.addContact(p7.getEmail());
        testProfiles.add(lordRafael);
        testProfiles.add(p1);
        testProfiles.add(p2);
        testProfiles.add(p3);
        testProfiles.add(p4);
        testProfiles.add(p5);
        testProfiles.add(p6);
        testProfiles.add(p7);
        return testProfiles;
    }
}
