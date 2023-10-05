package com.dao;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public interface UserDAO
{

   @Transactional
   public  int insert(User user);

}
