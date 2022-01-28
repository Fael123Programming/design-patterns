package br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.apps;

import br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions.App;
import br.com.rafael.gof.structural_patterns.bridge.ex04.exceptions.UnknownOperatingSystemException;

public class WinApp extends App {

    public WinApp() throws UnknownOperatingSystemException {
        super();
    }

//    This class does things specific for Windows systems!!!
//    The logic code should be put here...
}
