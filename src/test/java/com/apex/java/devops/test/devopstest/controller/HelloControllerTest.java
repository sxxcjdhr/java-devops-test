package com.apex.java.devops.test.devopstest.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class HelloControllerTest {
    @Autowired
    private HelloController helloController;
    @Test
    void hello() {
        helloController.Hello(true);
        //Assert.assertTrue(false);
    }
}