package com.homework1.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScans({
        @ComponentScan("com.homework1.beans.beans2"),
        @ComponentScan(value = "com.homework1.beans.beans3", excludeFilters = @ComponentScan.Filter(
                type = FilterType.REGEX, pattern = "^.+[^FD]$"
        ))
})
public class AppConfig2 {
}
