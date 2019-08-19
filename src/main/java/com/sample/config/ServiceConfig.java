package com.sample.config;

import com.sample.repository.EmpRepositoryI;
import com.sample.service.EmpServiceI;
import com.sample.service.impl.EmpServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RepositoryConfig.class})
@Configuration
public class ServiceConfig {
  @Bean
  public EmpServiceI empServiceI(EmpRepositoryI empRepositoryI) {
    return new EmpServiceImpl(empRepositoryI);
  }
}
