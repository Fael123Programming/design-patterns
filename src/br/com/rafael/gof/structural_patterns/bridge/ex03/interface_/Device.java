package br.com.rafael.gof.structural_patterns.bridge.ex03.interface_;

//Implementation.

public interface Device {
//    More basic operations!
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}
