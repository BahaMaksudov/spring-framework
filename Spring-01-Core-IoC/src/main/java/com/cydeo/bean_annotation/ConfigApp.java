package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean(name = "p2")
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean(name="p1")
    PartTimeMentor partTimeMentor1(){
        return new PartTimeMentor();
    }

    @Bean
    @Primary
    PartTimeMentor partTimeMentor2(){
        return new PartTimeMentor();
    }

    @Bean
    ContractingMentor contractingMentor () {
        return new ContractingMentor();
    }
}
