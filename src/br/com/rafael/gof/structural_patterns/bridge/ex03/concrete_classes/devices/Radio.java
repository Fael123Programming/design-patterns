package br.com.rafael.gof.structural_patterns.bridge.ex03.concrete_classes.devices;

import br.com.rafael.gof.structural_patterns.bridge.ex03.interface_.Device;

public class Radio implements Device {
    private int volume, channel;
    private boolean enabled;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        if(!isEnabled())
            enabled = true;
    }

    @Override
    public void disable() {
        if(isEnabled())
            enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100)
            throw new IllegalArgumentException("Volume less than 0");
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel < 0 || channel > 100)
            throw new IllegalArgumentException("Channel less than 0");
        this.channel = channel;
    }
}
