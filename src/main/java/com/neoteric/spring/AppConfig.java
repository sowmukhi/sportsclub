package com.neoteric.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Class1 class1() {
        return new Class1();
    }

    @Bean
    public Class2 class2() {
        return new Class2(class1());
    }
}
