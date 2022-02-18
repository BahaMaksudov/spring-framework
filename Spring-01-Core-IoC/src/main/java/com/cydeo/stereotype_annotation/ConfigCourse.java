package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan
@ComponentScan(basePackages = "com.cydeo")  //this we can use to search all packages under com.cydeo
public class ConfigCourse {
}
