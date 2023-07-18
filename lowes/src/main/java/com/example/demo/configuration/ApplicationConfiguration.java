package com.example.demo.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class ApplicationConfiguration {
    /*@Value("${spring.datasource.url}")
    String dataSourceURL;
    @Value("${spring.datasource.driverClassName}")
    String databaseDriver;
    @Value("${spring.datasource.username}")
    String databaseUsername;
    @Value("${spring.datasource.password}")
    String databasePassword;


    @Bean
    public DataSource getDatasource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(databaseDriver);
        dataSourceBuilder.url(dataSourceURL);
        dataSourceBuilder.username(databaseUsername);
        dataSourceBuilder.password(databasePassword);
        log.info("Loading datasource bean");
        return dataSourceBuilder.build();
    }*/
}
