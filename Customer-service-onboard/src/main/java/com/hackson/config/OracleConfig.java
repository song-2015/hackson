package com.hackson.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.validation.Valid;

@Configuration
public class OracleConfig {

    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String pwd;
    @Value("${db.instance}")
    private String instance;

    @Value("${db.url}")
    private String url;

    @Value("${db.driver}")
    private String driver;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setUsername(username);
        config.setPassword(pwd);
        config.setJdbcUrl(url);
        config.setDriverClassName(driver);
        config.setConnectionTestQuery("select 1");

        HikariDataSource hikariDataSource = new HikariDataSource(config);
        hikariDataSource.setMaximumPoolSize(50);
        hikariDataSource.setMinimumIdle(2);

        return hikariDataSource;
    }

}
