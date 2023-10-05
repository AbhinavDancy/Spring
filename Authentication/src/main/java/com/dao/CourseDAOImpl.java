package com.dao;

import com.entity.Course;
import com.entity.User;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CourseDAOImpl implements  CouseDAO
{
    @Autowired
    private EntityManager entityManager;

    public List<Course> getCourses()
    {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Course> criteriaQuery = criteriaBuilder.createQuery(Course.class);
        Root<Course> root = criteriaQuery.from(Course.class);
        criteriaQuery.select(root);
        TypedQuery<Course> courseTypedQuery = entityManager.createQuery(criteriaQuery);
        return courseTypedQuery.getResultList();
    }
  public List<String> getCoursesName(){
      CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
      CriteriaQuery<String> criteriaQuery = criteriaBuilder.createQuery(String.class);
      Root<Course> root = criteriaQuery.from(Course.class);
      criteriaQuery.select(root.<String> get("courseName"));
      return entityManager.createQuery(criteriaQuery).getResultList();

  }


}