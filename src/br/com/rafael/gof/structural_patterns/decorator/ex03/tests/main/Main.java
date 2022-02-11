package br.com.rafael.gof.structural_patterns.decorator.ex03.tests.main;

import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component.DataSource;
import br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.components.FileDataSource;
import br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.decorators.CompressionDecorator;
import br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.decorators.EncryptionDecorator;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("src/br/com/rafael/gof/structural_patterns/decorator/ex03/tests/main/test.txt");
        dataSource = new EncryptionDecorator(dataSource);
        dataSource = new CompressionDecorator(dataSource);
        dataSource.writeData("This is an example of implementation of the decorator design pattern");
        System.out.println(dataSource.readData());
    }
}
