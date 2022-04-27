package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "departments")
@NoArgsConstructor
public class Department {

    @Id
    private String department;
    private String division;

}
