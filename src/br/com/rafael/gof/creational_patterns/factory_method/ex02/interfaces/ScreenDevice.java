package br.com.rafael.gof.creational_patterns.factory_method.ex02.interfaces;

public interface ScreenDevice {
    void playMovie();

    void playGame();

    void increaseBrightness();

    void decreaseBrightness();

    int getBrightness();
}
