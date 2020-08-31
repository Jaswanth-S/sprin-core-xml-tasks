package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;



public class Movie implements ApplicationContextAware {
    ApplicationContext context;
    public ApplicationContext getContext() {
        return context;
    }
    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context=context;
    }
    Actor actor = new Actor();
    public Movie(){}

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
