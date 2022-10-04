package br.com.erudio.config.database;

import org.apache.commons.dbcp2.BasicDataSource;

public class Connection {

    private BasicDataSource datasource;

    public Connection(String local) {
        this.datasource = new BasicDataSource();

        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/rest_with_spring_boot_erudio?useTimezone=true&serverTimezone=UTC");
        datasource.setUsername("root");
        datasource.setPassword("2556");
    }

    public BasicDataSource getDatasource() {
        return datasource;
    }
}
