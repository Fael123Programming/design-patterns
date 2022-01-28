package br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions;

import br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.guis.LinuxGUI;
import br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.guis.MacGUI;
import br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.guis.WinGUI;
import br.com.rafael.gof.structural_patterns.bridge.ex04.exceptions.UnknownOperatingSystemException;

public abstract class App {
    private final GUI gui;

    public App() throws UnknownOperatingSystemException {
        String os = System.getProperty("os.name");
        gui = switch(os.toLowerCase()) {
            case "linux" -> new LinuxGUI();
            case "windows" -> new WinGUI();
            case "macos", "mac" -> new MacGUI();
            default -> throw new UnknownOperatingSystemException(os);
        };
    }

    public void initialize() {
        gui.start();
    }

    public GUI getGUI() {
        return gui;
    }
}
