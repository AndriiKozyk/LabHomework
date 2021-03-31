package com.homework1.beans.beansInjection;

import com.homework1.beans.others.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectSetter {

    private OtherBeanB beanB;

    @Qualifier("otherBeanB")
    @Autowired
    public void setBeanB(OtherBeanB beanB) {
        this.beanB = beanB;
    }

    public OtherBeanB getBeanB() {
        return beanB;
    }

}
