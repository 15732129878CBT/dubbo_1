package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cbt
 * @createDate 2022-03-15 18:48
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * dubbo启动时创建的动态代理对象
     *  <dubbo:reference interface="com.itheima.service.UserService" id="userService"/>
     */
    @Autowired
    private UserService userService;

    @GetMapping("/findByID")
    public User findByID(Integer id) {
        return userService.findByID(id);
    }
}
