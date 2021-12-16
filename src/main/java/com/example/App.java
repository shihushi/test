package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("service")
public class App {
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        context.getBean();
        System.out.println("hahah");
    }
}
