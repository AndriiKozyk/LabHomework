package com.homework1.configurations;

import com.homework1.beans.beans3.BeanE;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScans({
        @ComponentScan("com.homework1.beans.beans2"),
        @ComponentScan(value = "com.homework1.beans.beans3", excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE, classes = {BeanE.class}
        ))
})
public class AppConfig2 {
}
