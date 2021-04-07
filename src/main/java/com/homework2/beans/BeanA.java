package com.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("beanA InitializingBean afterPropertiesSet()");
    }

    public void destroy() throws Exception {
        System.out.println("beanA DisposableBean destroy()");
    }

}
