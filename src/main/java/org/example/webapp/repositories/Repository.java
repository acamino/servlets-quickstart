package org.example.webapp.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Repository<T> {

    private final EntityManager em;
    private final String entity;

    public Repository(Class<T> entity) {

        Map<String, String> properties = getProperties();
        em = Persistence
                .createEntityManagerFactory("servlets-quickstart", properties)
                .createEntityManager();

        this.entity = entity.getSimpleName();
    }

    public List<T> findAll() {
        Query query = em.createQuery(
                String.format("SELECT e FROM %s e", entity));

        return query.getResultList();
    }

    private EntityTransaction getTransaction() {
        return em.getTransaction();
    }

    private Map<String, String> getProperties() {
        Map<String, String> env = System.getenv();
        Map<String, String> config = new HashMap<>();
        for (String key : env.keySet()) {
            if (key.contains("JDBC_URL")) {
                config.put("javax.persistence.jdbc.url", env.get(key));
            }

            if (key.contains("DB_USER")) {
                config.put("javax.persistence.jdbc.user", env.get(key));
            }

            if (key.contains("DB_PASSWORD")) {
                config.put("javax.persistence.jdbc.password", env.get(key));
            }
        }

        return config;
    }
}
