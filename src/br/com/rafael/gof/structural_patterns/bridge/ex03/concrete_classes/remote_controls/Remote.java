package br.com.rafael.gof.structural_patterns.bridge.ex03.concrete_classes.remote_controls;

import br.com.rafael.gof.structural_patterns.bridge.ex03.interface_.Device;

//Second class hierarchy.
//In this example, this class and Device comprise the bridge...
//Abstraction.

public class Remote {
    protected Device device; //All the real work is delegated to this object via its interface...

    public Remote(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

//    The following operations explore those declared in Device: they are more complex.

    public void togglePower(){
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    public void volumeDown() {
        if (device.getVolume() == 0)
            return;
        device.setVolume(device.getVolume() - 1);
    }

    public void volumeUp() {
        if(device.getVolume() == 100)
            return;
        device.setVolume(device.getVolume() + 1);
    }

    public void channelDown(){
        if (device.getChannel() == 0)
            return;
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp(){
        if (device.getChannel() == 100)
            return;
        device.setChannel(device.getChannel() + 1);
    }
}
