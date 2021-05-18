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
      String msg = "This is from apex devops test";
      String repos = "git repos";
      String batch = "batch 1";
      String flagInfo = flag ? "flag is on" : "flag is off";

      String text = String.join("\n", msg, repos, batch, flagInfo);
      System.out.println(text);
      return text;
  }
}
