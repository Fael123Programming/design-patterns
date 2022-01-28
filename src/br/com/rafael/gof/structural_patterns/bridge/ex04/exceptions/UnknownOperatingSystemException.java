package br.com.rafael.gof.structural_patterns.bridge.ex04.exceptions;

public class UnknownOperatingSystemException extends Exception {

    public UnknownOperatingSystemException(String operatingSystem) {
        super("Unknown operating system: " + operatingSystem);
    }
}
