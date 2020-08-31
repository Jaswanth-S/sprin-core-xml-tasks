package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println("\n--Using AutoWire byName--");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor movie1 = context.getBean("actor1",Actor.class);
        System.out.println(movie1);

        System.out.println("\n--Using AutoWire constructor--");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Actor movie2 = context.getBean("actor2",Actor.class);
        System.out.println(movie2);

        System.out.println("\n--Using AutoWire byType--");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans2.xml");
        Actor movie3 = context.getBean("actor3",Actor.class);
        System.out.println(movie3+"\n");


    }
}
