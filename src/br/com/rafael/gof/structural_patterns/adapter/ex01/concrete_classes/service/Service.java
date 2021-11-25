package br.com.rafael.gof.structural_patterns.adapter.ex01.concrete_classes.service;

public class Service {
    public char[] serviceMethod(String specialData) {
        if(!specialData.toUpperCase().equals(specialData))
            throw new IllegalArgumentException("I cannot understand what you saying... sorry!");
        StringBuilder allVowels = new StringBuilder();
        for(char ch : specialData.toCharArray())
            if (isVowel(ch))
                allVowels.append(ch);
        return allVowels.toString().toCharArray();
    }

    private boolean isVowel(char ch) {
        for (char through : "aeiouAEIOU".toCharArray())
            if (through == ch)
                return true;
        return false;
    }
}
