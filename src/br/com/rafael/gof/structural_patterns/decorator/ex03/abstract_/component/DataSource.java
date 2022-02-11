package br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component;

public interface DataSource {
    void writeData(String data);
    String readData();
}
