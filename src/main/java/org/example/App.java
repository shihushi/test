package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan("service")
public class App 
{
    public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		System.out.println("hahah");
    }
}
