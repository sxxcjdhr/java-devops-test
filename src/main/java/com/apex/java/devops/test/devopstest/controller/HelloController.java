package com.apex.java.devops.test.devopstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiuxian.song
 * @version 1.0
 * @create: 2021-05-14 15:58
 */
@RestController
public class HelloController {
  @RequestMapping("/")
  public String Hello(boolean flag){
      String msg;
      if (flag){
          msg = "This is from apex devops test git repos, batch1, flag is on";
      }else{
          msg = "This is from apex devops test git repos, batch1, flag is off";
      }
      System.out.println(msg);
      return msg;
  }
}
