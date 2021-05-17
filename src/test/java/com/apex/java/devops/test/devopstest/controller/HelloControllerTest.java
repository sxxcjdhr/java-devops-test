package com.apex.java.devops.test.devopstest.controller;

import com.apex.java.devops.test.devopstest.DevopsTestApplication;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* HelloController Tester. 
* 
* @author <Authors name> 
* @since <pre>5? 16, 2021</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: Hello() 
* 
*/
@Autowired HelloController helloController;
@Test
public void testHello() throws Exception { 
//TODO: Test goes here...
    helloController.Hello();
} 


} 
