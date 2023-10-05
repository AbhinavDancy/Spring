package com.controller;


import com.dao.CourseDAOImpl;
import com.entity.Course;
import com.service.CourseService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.entity.*;

import java.util.List;

@Controller
public class HomeController
{
    @Autowired
    private UserService userService;
    @Autowired
    private CourseService courseService;


    // to populate the signup form
    @RequestMapping(path = "/signup", method ={RequestMethod.POST,RequestMethod.GET})
    public String signup(@ModelAttribute ("user") User user, Model model)
    {
        List<Course> courseList = courseService.getCourses();
        try {
            for (Course c : courseList) {
                System.out.println(c);
            }

        } catch (Exception e) {
            System.out.println("Unable to fetch the course Details....");
            e.printStackTrace();
        }
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''/n");
        List<String> courseLists = courseService.getCourseName();
        try {
            for (String c : courseLists) {
                System.out.println(c);
            }

        } catch (Exception e) {
            System.out.println("Unable to fetch the course Details from the name....");
            e.printStackTrace();
        }

        model.addAttribute("courseList",courseLists);
        return "signUp";

    }
    // To register the signup form details  to DB
    @RequestMapping(path = "/register",method = RequestMethod.POST )
    @ModelAttribute
    public  String register(@ModelAttribute User user , Model model){

        System.out.println(user.toString());
        int r = userService.insertUser(user);
        System.out.println("the user is created" + r);

        return "register";
    }
}
