package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "course_detail")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column( name = "course_name")
    private String courseName;
    @Column(name = "course_url")
    private String courseURL;

    public Course(int id, String courseName, String courseURL)
    {
        this.id = id;
        this.courseName = courseName;
        this.courseURL = courseURL;
    }
    public Course()
    {

    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseURL()
    {
        return courseURL;
    }

    public void setCourseURL(String courseURL)
    {
        this.courseURL = courseURL;
    }

    @Override
    public String toString()
    {
        return "Course{" + "id=" + id + ", courseName='" + courseName + '\'' + ", courseURL='" + courseURL + '\'' + '}';
    }
}
