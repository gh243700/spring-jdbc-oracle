package com.sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:database/jdbc.properties")
public class JdbcConfig {


  @Value(value = "${jdbc.className}")
  private String className;
  @Value(value = "${jdbc.url}")
  private String url;
  @Value()





}
