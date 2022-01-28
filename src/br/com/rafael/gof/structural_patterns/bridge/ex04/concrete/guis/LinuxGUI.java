package br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.guis;

import br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions.GUI;

public class LinuxGUI extends GUI {
//    Things of Linux-specific Graphics User Interface...
    public void start() {
        System.out.println("Showing a GUI specific for Linux operating system...");
    }
}
