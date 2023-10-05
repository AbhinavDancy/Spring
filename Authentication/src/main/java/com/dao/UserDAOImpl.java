package com.dao;

import com.entity.User;
import com.service.UserService;
import jakarta.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO
{
    @Autowired
    EntityManager entityManager;

    @Transactional
    public int insert(User user) {
            int r = 1;
            try {
                entityManager.persist(user);

            }
            catch (Exception e) {
                r = 0;
                e.printStackTrace();
            }
            finally {
                entityManager.flush();
            }
            return r;
    }
}


