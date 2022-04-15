package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

//        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
//        ft.createAccount();
//
        String str1 = container.getBean(String.class);
        System.out.println(str1);

        Integer num = container.getBean(Integer.class);
        System.out.println(num);

        //handling multiple beans having same method - adding @Bean(name = "p1")
        PartTimeMentor pt = container.getBean("p2",PartTimeMentor.class);
        pt.createAccount();

//        Car car1 = container.getBean(Car.class);
//        System.out.println(car1.getMake());

        Car car1 = container.getBean("c1",Car.class);
        System.out.println(car1.getMake());

//        //handling multiple beans having same method - @Primary
//        PartTimeMentor pt1 = container.getBean(PartTimeMentor.class);
//        pt1.createAccount();
//
//        String str = container.getBean(String.class);
//        System.out.println(str);
//
//        ContractingMentor cm = container.getBean(ContractingMentor.class);
//        cm.createAccount();
//
//
//        Double dn = container.getBean(Double.class);
//        System.out.println(dn);

    }
}
