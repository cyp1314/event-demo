package com.example.eventdemo.rest;

import com.example.eventdemo.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ApplicationContext context;

    @GetMapping("hello")
    public String hello(){
        MyEvent event = new MyEvent("test");
        context.publishEvent(event);
        return "hello";
    }

    @GetMapping("hello2")
    public String hello2(){
        MyEvent event = new MyEvent("test");
        context.publishEvent(event);
        return "hello";
    }
}
