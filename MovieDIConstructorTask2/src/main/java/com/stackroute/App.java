package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("\nDependency injection through constructor and looked up the Actor details:");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor1= context1.getBean("actor1",Actor.class);
        System.out.println(actor1+"\n");

        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2= context2.getBean("movie2",Movie.class);
        System.out.println(movie2+"\n");

        ApplicationContext context3 = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie3= context3.getBean("movie3",Movie.class);
        System.out.println(movie3+"\n");

        System.out.println(movie2==movie3);

        System.out.println("\n after using prototype...");
        ApplicationContext con2 = new ClassPathXmlApplicationContext("beans2.xml");
        Movie mov2= context2.getBean("movie2",Movie.class);
        System.out.println(movie2+"\n");

        ApplicationContext con3 = new ClassPathXmlApplicationContext("beans2.xml");
        Movie mov3= context3.getBean("movie3",Movie.class);
        System.out.println(movie3+"\n");
    }
}
