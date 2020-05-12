package com.tedrain.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
* @RestController 注解说明 controller 里面的方法都以json格式输出，不用写jackjson配置
* @Controller 普通页面
 * */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello,SpringBoot!";
    }
}
