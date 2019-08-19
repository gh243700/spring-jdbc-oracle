package com.sample.config;


import com.sample.repository.EmpRepositoryI;
import com.sample.repository.Impl.EmpRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@Import(JdbcConfig.class)
public class RepositoryConfig {

  @Bean
  public EmpRepositoryI empRepositoryI(JdbcTemplate jdbcTemplate){
    return new EmpRepositoryImpl(jdbcTemplate);
  }

  }

