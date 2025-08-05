package com.example.first_springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoContoller {
     @RequestMapping("/hello")
     public String sayHello()
     {
    	 System.out.println("Welcome to Spring boot ......");
    	 return "Hello";
     }
}
