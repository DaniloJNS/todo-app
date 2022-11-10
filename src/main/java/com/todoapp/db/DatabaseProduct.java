package com.todoapp.db;


import bitronix.tm.resource.jdbc.PoolingDataSource;

public enum DatabaseProduct {
    H2(
            new DataSourceConfigurantion() {
                @Override
                public void configure(PoolingDataSource ds, String connectionURL) {
                    ds.setClassName("org.h2.jdbcx.JdbcDataSource");
                    ds.getDriverProperties().put("URL",
                            connectionURL == null ? "jdbc:h2:mem:test" : connectionURL);
                }
            },
            org.hibernate.dialect.H2Dialect.class.getName()
    );

    public final DataSourceConfigurantion configurantion;
    public final String hibernateDialect;

    private DatabaseProduct(DataSourceConfigurantion configurantion, String hibernateDialect) {
        this.configurantion = configurantion;
        this.hibernateDialect = hibernateDialect;
    }

    public interface DataSourceConfigurantion {
        void configure(PoolingDataSource ds, String connectionURL);

    }
}
