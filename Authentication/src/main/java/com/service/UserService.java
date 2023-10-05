package com.service;

import Handler.EncryptedAttribute;
import com.dao.UserDAO;
import com.dao.UserDAOImpl;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService
{
    @Autowired
    UserDAO userDAO;

    // provides the service between the Controller and the DAO layer
    @Transactional
    public int insertUser(User user) {
       user.setPassword( EncryptedAttribute.encryptPassword(user.getPassword()));
       int noOfRecordsSaved = userDAO.insert(user);
       return noOfRecordsSaved;

    }
}
