package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Cbt
 * @createDate 2022-03-14 18:25
 */
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User findByID(Integer id) {
        return userDao.findByID(id);
    }
}
