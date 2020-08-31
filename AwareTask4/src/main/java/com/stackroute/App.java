package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movie1",Movie.class);
        System.out.println(movie1+"\n");

        System.out.println("Using ApplicationContextAware");
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        context1.registerShutdownHook();
        Movie movie2 = context1.getBean("movie1",Movie.class);
        System.out.println(movie2);movie2.setApplicationContext(context);

        AbstractApplicationContext  context3 = new ClassPathXmlApplicationContext("beans2.xml");
        context3.registerShutdownHook();
    }
}
