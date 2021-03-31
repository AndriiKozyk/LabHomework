package com.homework1.beans.part7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
@Qualifier("dog")
public class Dog implements Animal {

    public String sound() {
        return "gav-gav";
    }

}
