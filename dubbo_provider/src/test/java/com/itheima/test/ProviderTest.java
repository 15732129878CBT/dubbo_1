package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cbt
 * @createDate 2022-03-15 16:11
 */
public class ProviderTest {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring-service.xml");
        UserService us = cpx.getBean(UserService.class);
        System.out.println(us.findByID(1));
    }
}
