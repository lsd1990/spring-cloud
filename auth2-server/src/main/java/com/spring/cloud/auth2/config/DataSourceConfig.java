package com.spring.cloud.auth2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Value("classpath:schema.sql")
    private Resource schemaScript;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.user}")
    private String jdbcUser;

    @Value("${jdbc.pass}")
    private String jdbcPass;

    @Value("${hibernate.dialect}")
    private String HIBERNATE_DIALECT;

    @Value("${hibernate.show_sql}")
    private String HIBERNATE_SHOW_SQL;
    @Value("${hibernate.format_sql}")
    private String HIBERNATE_FORMAT_SQL;
    @Value("${hibernate.use_sql_comments}")
    private String HIBERNATE_USE_SQL_COMMENTS;
    @Value("${hibernate.generate_statistics}")
    private String HIBERNATE_GENERATE_STATISTICS;
    @Value("${hibernate.cache.use_second_level_cache}")
    private String HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
    @Value("${hibernate.cache.use_query_cache}")
    private String HIBERNATE_CACHE_USE_QUERY_CACHE;
    @Value("${hibernate.max_fetch_depth}")
    private String HIBERNATE_MAX_FETCH_DEPTH;
    @Value("${hibernate.default_batch_fetch_size}")
    private String HIBERNATE_DEFAULT_BATCH_FETCH_SIZE;
    @Value("${hibernate.jdbc.batch_size}")
    private String HIBERNATE_JDBC_BATCH_SIZE;
    @Value("${hibernate.jdbc.fetch_size}")
    private String HIBERNATE_JDBC_FETCH_SIZE;

    @Value("${entitymanager.packagesToScan}")
    private String ENTITYMANAGER_PACKAGES_TO_SCAN;

//    @Bean
//    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
//        DataSourceInitializer initializer = new DataSourceInitializer();
//        initializer.setDataSource(dataSource);
//        initializer.setDatabasePopulator(databasePopulator());
//        return initializer;
//    }
//
//    private DatabasePopulator databasePopulator() {
//        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//        populator.addScript(schemaScript);
//        return populator;
//    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(jdbcDriverClassName);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(jdbcUser);
        dataSource.setPassword(jdbcPass);
        return dataSource;
    }

//    @Bean(name = "sessionFactory")
//    @Primary
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactoryBean = createMysqlSessionFactory(dataSource());
//        return sessionFactoryBean;
//    }
//
//    private LocalSessionFactoryBean createMysqlSessionFactory(DataSource dataSource) {
//        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        sessionFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
//        sessionFactoryBean.setPhysicalNamingStrategy(new SpringPhysicalNamingStrategy());
//        Properties hibernateProperties = new Properties();
//        hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
//        hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
//        hibernateProperties.put("hibernate.format_sql", true);
//        hibernateProperties.put("hibernate.use_sql_comments", HIBERNATE_USE_SQL_COMMENTS);
//        hibernateProperties.put("hibernate.generate_statistics", HIBERNATE_GENERATE_STATISTICS);
//        hibernateProperties.put("hibernate.cache.use_second_level_cache", HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE);
//        hibernateProperties.put("hibernate.cache.use_query_cache", HIBERNATE_CACHE_USE_QUERY_CACHE);
//        hibernateProperties.put("hibernate.max_fetch_depth", HIBERNATE_MAX_FETCH_DEPTH);
//        hibernateProperties.put("hibernate.default_batch_fetch_size", HIBERNATE_DEFAULT_BATCH_FETCH_SIZE);
//        hibernateProperties.put("hibernate.jdbc.batch_size", HIBERNATE_JDBC_BATCH_SIZE);
//        hibernateProperties.put("hibernate.jdbc.fetch_size", HIBERNATE_JDBC_FETCH_SIZE);
//        sessionFactoryBean.setHibernateProperties(hibernateProperties);
//        return sessionFactoryBean;
//    }
}
