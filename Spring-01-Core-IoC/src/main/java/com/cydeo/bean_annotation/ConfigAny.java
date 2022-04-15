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


    @Bean
    Car car1() {
        Car c = new Car();
        c.setMake("Audi");
        return c;
    }

    @Bean(name = "c1")
//    @Bean
    @Primary
    Car car2() {
        Car c = new Car();
        c.setMake("Tesla");
        return c;
    }
}
