package com.sample.config;

import com.sample.controller.EmpController;
import com.sample.service.EmpServiceI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceConfig.class)
public class ControllerConfig {

  @Bean
  public EmpController empController(EmpServiceI empServiceI){
    return new EmpController(empServiceI);
  }

}
