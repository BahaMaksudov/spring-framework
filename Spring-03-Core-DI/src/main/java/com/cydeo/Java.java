package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    //Field Injection
    //@Autowired
    // OfficeHours officeHours;
//
//    //constructor injection
    OfficeHours officeHours;
//    @Autowired
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));
    }
}
