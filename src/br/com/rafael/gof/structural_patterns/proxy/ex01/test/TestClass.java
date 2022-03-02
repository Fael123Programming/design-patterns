package br.com.rafael.gof.structural_patterns.proxy.ex01.test;

import br.com.rafael.gof.structural_patterns.proxy.ex01.app.Application;

public class TestClass {
    public static void main(String[] args) {
        Application app = new Application();
        app.playVideo("https://youtu.be/Bnjbun-hiBk", "UCM-yUTYGmrNvKOCcAl21g3w");
    }
}
