package com.homework1.beans.beansInjection;

import com.homework1.beans.others.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectField {

    @Qualifier("otherBeanC")
    @Autowired
    private OtherBeanC beanC;

    public OtherBeanC getBeanC() {
        return beanC;
    }

    public void setBeanC(OtherBeanC beanC) {
        this.beanC = beanC;
    }
}
