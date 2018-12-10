package com.spring.hello;

import com.spring.hello.common.HelloeWordService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class HelloAction {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        HelloeWordService hws = (HelloeWordService) app.getBean("helloWorsService");
        HelloWord hw = hws.getHw();
        hw.action();

    }
}
