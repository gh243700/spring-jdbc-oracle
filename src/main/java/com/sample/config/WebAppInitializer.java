//package com.sample.config;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//  @Override
//  protected Class<?>[] getRootConfigClasses() {
//    return new Class[] {
//        Controller.class
//    };
//  }
//
//  @Override
//  protected Class<?>[] getServletConfigClasses() {
//    return new Class[] {
//        MainWebConfig.class,
//        ApiWebConfig.class
//    };
//  }
//
//  @Override
//  protected String[] getServletMappings() {
//    return new String[]{"/main/*"};
//  }
//}
