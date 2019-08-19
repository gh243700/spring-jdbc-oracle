package com.sample.config;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class ApiWebConfig implements WebApplicationInitializer {

  @Override
  public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
    servletContext.addListener(new ContextLoaderListener());

    AnnotationConfigWebApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigWebApplicationContext();
    annotationConfigApplicationContext.register(WebMvcConfigurer.class);
    annotationConfigApplicationContext.setServletContext(servletContext);

    ServletRegistration.Dynamic servlet =
        servletContext.addServlet(
            "appServlet", new DispatcherServlet(annotationConfigApplicationContext));
    servlet.setLoadOnStartup(1);
    servlet.addMapping("/");

  }
}
