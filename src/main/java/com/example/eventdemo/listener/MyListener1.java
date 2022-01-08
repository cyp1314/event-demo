package com.example.eventdemo.listener;

import com.example.eventdemo.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent (MyEvent event) {
        Object source = event.getSource();
        System.out.println("-------------->"+source);
        log.info(String.format("%s监听到事件源：%s.", MyListener1.class.getName(), event.getSource()));
    }
}
