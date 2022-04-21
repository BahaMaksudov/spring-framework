package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="students") //this will create table name
public class Student {

    @Id //@Id means we want this field to be primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName;  //column name will be created: first_name

    @Column(name = "studentLastName")
    private String lastName;
    private String email;


    @Transient //this annotation will not create the city as a column in db
    private String city;

    @Column(name = "DATE")
    private LocalDate birthDate;
    @Column(name = "TIME")
    private LocalTime birthTime;
    @Column(name = "TIMESTAMP")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
