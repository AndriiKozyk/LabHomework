package com.homework1.beans.part7;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Primary
public class Bird implements Animal {

    public String sound() {
        return "chick-chirick";
    }

}
