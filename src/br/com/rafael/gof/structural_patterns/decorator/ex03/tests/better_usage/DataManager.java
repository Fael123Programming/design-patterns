package br.com.rafael.gof.structural_patterns.decorator.ex03.tests.better_usage;

import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component.DataSource;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String readData() {
        return this.dataSource.readData();
    }

    public void writeData(String data) {
        this.dataSource.writeData(data);
    }
}
