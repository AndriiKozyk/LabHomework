package com.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@DependsOn(value = "beanB")
public class BeanC {

    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;

    private void initMethod() {
        System.out.println("beanC init");
    }

    private void destroyMethod() {
        System.out.println("beanC destroy");
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
