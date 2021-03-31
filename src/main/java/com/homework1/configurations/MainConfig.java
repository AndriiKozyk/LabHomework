package com.homework1.configurations;

import com.homework1.beans.beans3.BeanE;
import com.homework1.beans.beansInjection.InjectConstructor;
import com.homework1.beans.others.OtherBeanA;
import com.homework1.beans.part7.BeanPart8;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppConfig1.class, AppConfig2.class})
@ComponentScans({
        @ComponentScan(basePackageClasses = BeanE.class),
        @ComponentScan(basePackageClasses = InjectConstructor.class),
        @ComponentScan(basePackageClasses = OtherBeanA.class),
        @ComponentScan(basePackageClasses = BeanPart8.class)
})
public class MainConfig {
}
