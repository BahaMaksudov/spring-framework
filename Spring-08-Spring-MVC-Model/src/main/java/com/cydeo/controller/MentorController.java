package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    // @RequestMapping("mentor/list") - this is not a good approach, since you have to change it in every method in this class

    @RequestMapping("/list")     //  localhost:8080/mentor/list
    public String showTable (Model model) {

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Tom", "Hanks", 55, Gender.MALE));
        mentorList.add(new Mentor("Julia", "Rob", 53, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";


    }
}
