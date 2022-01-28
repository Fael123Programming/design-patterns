package br.com.rafael.gof.structural_patterns.bridge.ex04.app_factory;

import br.com.rafael.gof.structural_patterns.bridge.ex04.abstractions.App;
import br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.apps.LinuxApp;
import br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.apps.MacApp;
import br.com.rafael.gof.structural_patterns.bridge.ex04.concrete.apps.WinApp;
import br.com.rafael.gof.structural_patterns.bridge.ex04.exceptions.UnknownOperatingSystemException;

public class AppFactory {

    public static App getProperApp() throws UnknownOperatingSystemException {
        String os = System.getProperty("os.name");
        return switch(os.toLowerCase()) {
            case "linux" -> new LinuxApp();
            case "windows", "win" -> new WinApp();
            case "macos", "mac" -> new MacApp();
            default -> throw new UnknownOperatingSystemException(os);
        };
    }
}
