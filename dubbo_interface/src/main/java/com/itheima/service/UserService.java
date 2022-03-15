package com.itheima.service;

import com.itheima.pojo.User;

/**
 * @author Cbt
 * @createDate 2022-03-14 17:25
 */
public interface UserService {
    User findByID(Integer id);
}
