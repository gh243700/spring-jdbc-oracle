package com.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "com.sample.controller")
@Configuration
public class MainWebConfig implements WebMvcConfigurer {

  @Bean
  public InternalResourceViewResolver internalResourceViewResolver(){
    InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
    internalResourceViewResolver.setPrefix("/WEB-INF/views/");
    internalResourceViewResolver.setSuffix("/WEB-INF/.jsp/");
    return internalResourceViewResolver;
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
//    registry.addResourceHandler("/WEB-INF/resources/*").
//        addResourceLocations("/WEB-INF/resources/images/**").
//        addResourceLocations("/WEB-INF/resources/js/**").
//        addResourceLocations("/WEB-INF/resources/css/**");
  }
}
