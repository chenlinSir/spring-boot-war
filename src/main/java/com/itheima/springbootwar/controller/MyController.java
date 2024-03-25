package com.itheima.springbootwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: spring-boot-war
 * @BelongsPackage: com.itheima.springbootwar.mycontroller
 * @Author: chenLin
 * @CreateTime: 2024-03-25  15:32
 * @Description: TODO
 * @Version: 1.0
 */
@Controller
public class MyController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("进入了控制器");
        return "hello";
    }
}
