package br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.decorator;

import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component.DataSource;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        this.dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return this.dataSource.readData();
    }

    public DataSource getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
