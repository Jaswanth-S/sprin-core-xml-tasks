package com.stackroute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
public class BeanFactoryAwareDemo  implements BeanFactoryAware{
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory:");
    }
    public BeanFactoryAwareDemo(){
        System.out.println("\nBeanFactoryAware is Initialized.");
    }
}
