package com.homework1.beans.beansInjection;

import com.homework1.beans.others.OtherBeanA;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectConstructor {

    @Qualifier("otherBeanA")
    private OtherBeanA beanA;

    public InjectConstructor(OtherBeanA beanA) {
        this.beanA = beanA;
    }

    public OtherBeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(OtherBeanA beanA) {
        this.beanA = beanA;
    }
}
