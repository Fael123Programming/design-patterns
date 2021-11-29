package br.com.rafael.gof.structural_patterns.bridge.ex03.concrete_classes.remote_controls;

import br.com.rafael.gof.structural_patterns.bridge.ex03.interface_.Device;

// You can extend classes from the abstraction hierarchy
// independently of device classes.

public class AdvancedRemote extends Remote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        this.device.setVolume(0);
    }

    public void callPresidentOfUSA() {
        System.out.println("You are demanding too much from me...");
    }
}
