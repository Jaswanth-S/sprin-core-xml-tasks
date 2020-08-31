package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean
{
String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("\n--This method is predefined after properties set and name is "+name+"--" );
    }

    public void destroy() throws Exception {
        System.out.println("--This is predefined destroy method--");
    }

    public void myInit()
    {
        System.out.println("--This is user defined Init method--");
    }
    public void myDestroy()
    {
        System.out.println("--This is user defined Destroy method--");
    }

}