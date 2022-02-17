package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    Integer number() {
        return 100;
    }

    @Bean
    @Primary
    String str1(){
        return "Developer Name";
    }

    @Bean
    Double doubleNumber(){
        return 250.0;
    }
}
