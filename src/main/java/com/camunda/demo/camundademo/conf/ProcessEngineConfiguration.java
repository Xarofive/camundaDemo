package com.camunda.demo.camundademo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class ProcessEngineConfiguration {

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setUrl("jdbc:h2:mem:camunda;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("demo");
        dataSource.setPassword("demo");
        return dataSource;
    }
}