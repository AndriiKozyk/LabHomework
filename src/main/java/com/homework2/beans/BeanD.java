package com.homework2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class BeanD {

    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;

    private void initMethod() {
        System.out.println("beanD init");
    }

    private void destroyMethod() {
        System.out.println("beanD destroy");
    }

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
