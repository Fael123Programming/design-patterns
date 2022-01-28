package br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.guis;

import br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions.GUI;

public class MacGUI extends GUI {
//    Things of a macOS Graphics User Interface...
    public void start() {
        System.out.println("Showing a GUI specific for macOS operating systems...");
    }
}
