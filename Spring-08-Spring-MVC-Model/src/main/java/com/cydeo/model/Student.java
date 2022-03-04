package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

// POJO doesnt have to be annotated if class is not a dependency
@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String firstName;
    private String lastName;

}
