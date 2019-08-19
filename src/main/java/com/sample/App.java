package com.sample;

import com.sample.config.JdbcConfig;
import com.sample.service.EmpServiceI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        EmpServiceI empServiceI = context.getBean("empServiceI", EmpServiceI.class);
        printInfo("사원의 수 조회");
        System.out.println( empServiceI.getEmpCount());
        printInfo("103번 사원의 정보를 조회");
        System.out.println(empServiceI.getEmpInfo(103));

    }
    static void printInfo(String message){
        System.out.println("---"+message);
    }
}
