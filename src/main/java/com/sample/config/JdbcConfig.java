package com.sample.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = "com.sample")
@PropertySource(value = "classpath:database/jdbc.properties")
public class JdbcConfig {

  @Value(value = "${jdbc.className}")
  private String className;

  @Value(value = "${jdbc.url}")
  private String url;

  @Value(value = "${jdbc.username}")
  private String username;

  @Value(value = "${jdbc.password}")
  private String password;

  @Bean
  public BasicDataSource basicDataSource() {
    BasicDataSource basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName(className);
    basicDataSource.setUrl(url);
    basicDataSource.setUsername(username);
    basicDataSource.setPassword(password);
    return basicDataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(basicDataSource());
  }
}
