package br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.decorators;

import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component.DataSource;
import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.decorator.DataSourceDecorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(this.encrypt(data));
    }

    @Override
    public String readData() {
        return this.decrypt(super.readData());
    }

    private String encrypt(String message) {
        return message + "(encrypted)"; //This way just for simplicity’s sake...
    }

    private String decrypt(String message) {
        return message.replace("(encrypted)", ""); //This way just for simplicity purposes...
    }
}
