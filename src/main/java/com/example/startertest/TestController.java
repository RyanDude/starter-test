package com.example.startertest;

import com.example.myspringbootstarter.Service.HelloService;
import com.example.myspringbootstarter.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {
    @Autowired
    SampleService sampleService;
    @Autowired
    HelloService helloService;
    @RequestMapping("/test")
    public String test(){
        return helloService.say();
    }
    @RequestMapping("/reflection")
    public String reflection(){
        return sampleService.wrap("sample-service");
    }
}
