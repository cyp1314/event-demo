package com.example.eventdemo.listener;

import com.example.eventdemo.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyListener4 {

    @EventListener
    public void listener(MyEvent event){
        log.info("----------------------->方式四<--------------------------");
        log.info(String.format("%s监听到事件源：%s.", MyListener4.class.getName(), event.getSource()));
    }
}
