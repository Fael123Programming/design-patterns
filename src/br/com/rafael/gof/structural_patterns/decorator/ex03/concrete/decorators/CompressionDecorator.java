package br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.decorators;

import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component.DataSource;
import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.decorator.DataSourceDecorator;


public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(this.compress(data));
    }

    @Override
    public String readData() {
        return this.decompress(super.readData());
    }

    private String compress(String data) {
        return data + "(compressed)";
    }

    private String decompress(String data) {
        return data.replace("(compressed)", "");
    }
}
