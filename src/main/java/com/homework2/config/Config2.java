package com.homework2.config;

import com.homework2.beans.BeanB;
import com.homework2.beans.BeanC;
import com.homework2.beans.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Config1.class)
public class Config2 {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public BeanB getBeanB() {
        return new BeanB();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public BeanC getBeanC() {
        return new BeanC();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public BeanD getBeanD() {
        return new BeanD();
    }

}
