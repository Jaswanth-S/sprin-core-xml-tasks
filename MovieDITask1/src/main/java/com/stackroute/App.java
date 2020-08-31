package com.stackroute;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        System.out.println("--Using BeanFactory--");
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = beanFactory.getBean("movie",Movie.class);
        System.out.println(movie1+"\n");

        System.out.println("--Using ApplicationContext--");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3 = context.getBean("movie1",Movie.class);
        System.out.println(movie3+"\n");
    }
}
