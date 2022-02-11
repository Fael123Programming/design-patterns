package br.com.rafael.gof.structural_patterns.decorator.ex03.tests.better_usage;

import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component.DataSource;
import br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.components.FileDataSource;
import br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.decorators.CompressionDecorator;
import br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.decorators.EncryptionDecorator;

public class Application {
    private DataManager dataManager;

    public void configureDataStuff(boolean allowEncryption, boolean allowCompression) {
        DataSource dataSource = new FileDataSource("src/br/com/rafael/gof/structural_patterns/decorator/" +
                "ex03/better_usage/test.txt");
        if (allowEncryption)
            dataSource = new EncryptionDecorator(dataSource);
        if (allowCompression)
            dataSource = new CompressionDecorator(dataSource);
        this.dataManager = new DataManager(dataSource);
    }

    public DataManager getDataManager() {
        return this.dataManager;
    }

    public void setDataManager(DataManager dataManager) {
        this.dataManager = dataManager;
    }
}
