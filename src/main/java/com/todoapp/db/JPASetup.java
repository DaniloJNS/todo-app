package com.todoapp.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.internal.util.StringHelper;

import java.util.*;


public class JPASetup {

    protected String persistenceUnitName;
    protected final Map<String, String> properties = new HashMap<String, String>();
    protected EntityManagerFactory entityManagerFactory;

    public JPASetup(DatabaseProduct databaseProduct, String persistenceUnitName, String... hbmResources) throws Exception {
        this.persistenceUnitName = persistenceUnitName;
        properties.put("hibernate.archive.autodetection", "none");

        List<String> ls = new ArrayList<String>();
        if (hbmResources != null) {
            Collections.addAll(ls, hbmResources);
        }

        properties.put("hibernate.hbmxml.files", StringHelper.join(",", ls.iterator()));
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.dialect", databaseProduct.hibernateDialect);
        entityManagerFactory = Persistence.createEntityManagerFactory(getPersistenceUnitName(), properties);
    }

    public String getPersistenceUnitName() {
        return persistenceUnitName;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    public void createSchema() {
        generateSchema("create");
    }
    public void dropSchema() {
        generateSchema("drop");
    }

    public void generateSchema(String action) {
        Map<String, String> createSchemaProperties = new HashMap<String, String>(properties);
        createSchemaProperties.put("jakarta.persistence.schema-generation.database-action", action);

        Persistence.generateSchema(getPersistenceUnitName(), createSchemaProperties);
    }
}
