package com.homework1.beans.part7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
@Qualifier("cat")
public class Cat implements Animal {

    public String sound() {
        return "mew-mew";
    }

}
