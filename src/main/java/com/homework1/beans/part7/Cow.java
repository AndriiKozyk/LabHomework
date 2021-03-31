package com.homework1.beans.part7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@Qualifier("cow")
public class Cow implements Animal {

    public String sound() {
        return "moo-moo";
    }

}
