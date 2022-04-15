package com.cydeo.bootstrap;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<Mentor> createMentor (){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Tom", "Hanks", 55, Gender.MALE));
        mentorList.add(new Mentor("Julia", "Rob", 53, Gender.FEMALE));

        return mentorList;
    }

}
