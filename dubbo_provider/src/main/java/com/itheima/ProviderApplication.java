package com.itheima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Cbt
 * @createDate 2022-03-15 16:44
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cxp = new ClassPathXmlApplicationContext("spring-provider.xml");
        System.in.read();
    }
}
