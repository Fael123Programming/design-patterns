package br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.apps;

import br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions.App;
import br.com.rafael.gof.structural_patterns.bridge.ex04.exceptions.UnknownOperatingSystemException;

public class LinuxApp extends App {

    public LinuxApp() throws UnknownOperatingSystemException {
        super();
    }

//    This class does things specific for Linux systems!!!
//    The logic code should be put here...
}
