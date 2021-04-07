package com.homework2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class OtherBean2 implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        try {
            Field name = bean.getClass().getDeclaredField("name");
            Field value = bean.getClass().getDeclaredField("value");
            name.setAccessible(true);
            value.setAccessible(true);
            Object nameValue = name.get(bean);
            Object valueValue = value.get(bean);

            if (nameValue == null && valueValue == null || (Integer) valueValue < 0) {
                System.out.println("Validation " + beanName + " fail");
                return bean;
            }

            System.out.println("Validation " + beanName + " success");

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println(beanName + " validation fail. No field " + e.getMessage());
        }
        return bean;
    }
}
