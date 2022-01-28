package br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.guis;

import br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions.GUI;

public class WinGUI extends GUI {
//    Things of a Windows-specific Graphics User Interface...
    public void start() {
        System.out.println("Showing a GUI specific for Windows operating systems...");
    }
}
