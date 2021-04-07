package com.homework2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE {

    private String name;
    private int value;

    @PostConstruct
    private void postConstruct() {
        System.out.println("beanE PostConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("beanE PreDestroy");
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
