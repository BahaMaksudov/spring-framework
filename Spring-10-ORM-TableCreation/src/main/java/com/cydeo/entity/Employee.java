package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id //annotation makes id field primary key in DB
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}

//class name - creates table name in DB
//field name - creates column name
//objects - creates rows in DB