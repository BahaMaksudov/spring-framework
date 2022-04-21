package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="departments")
@NoArgsConstructor
@Data
public class Department extends BaseEntity{

    private String department;
    private String division;

    //create bidirectional relationship with employees table (Employee class)
    //"department" name has to match same field name in the Employee class
    //Employee table has foreign key
    @OneToOne(mappedBy = "department") //
    private Employee employee;

    //create constructor
    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }
}
