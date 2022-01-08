package com.example.eventdemo;

import com.example.eventdemo.listener.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventDemoApplication {

    public static void main (String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(EventDemoApplication.class, args);
        ctx.addApplicationListener(new MyListener1());
    }

}
