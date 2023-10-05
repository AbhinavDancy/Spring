package com.service;

import com.dao.CourseDAOImpl;
import com.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService
{
    @Autowired
    CourseDAOImpl courseDAO;
    // provides a service between the controller and the DAO classes
    public List<Course> getCourses(){
        List<Course> courseList = courseDAO.getCourses();
        return courseList;
    }
    public List<String> getCourseName(){
        List<String> courseList = courseDAO.getCoursesName();
        return courseList;
    }
}
