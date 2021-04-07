package com.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class OtherBean1 implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("beanB");
        System.out.println("---BeanFactoryPostProcessor---");
        System.out.println("beanB initMethod before: " + beanDefinition.getInitMethodName());
        beanDefinition.setInitMethodName("AnotherInitMethod");
        System.out.println("beanB initMethod after: " + beanDefinition.getInitMethodName());
    }

}
