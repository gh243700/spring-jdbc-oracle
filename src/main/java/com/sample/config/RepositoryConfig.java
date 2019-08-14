package com.sample.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JdbcConfig.class)
public class RepositoryConfig {
//  @Bean
//  public TestRepository testRepository(JdbcTemplate jdbcTemplate){
//        return new TestRepository(jdbcTemplate);
//  }

}
