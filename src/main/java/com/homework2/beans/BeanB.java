package com.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@DependsOn(value = "beanD")
public class BeanB {

    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private int value;

    private void initMethod() {
        System.out.println("beanB init");
    }

    private void destroyMethod() {
        System.out.println("beanB destroy");
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
