package com.config.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAction {
    public static void main(String[] args) {
        /**
         * 之所以使用AppConfig是为了把多个Bean集成到一起，get的时候比较方便
         *
         */
        ApplicationContext app= new AnnotationConfigApplicationContext(AppConfig.class);//直接使用StudentConfig.class同样可以

        Student stu =(Student) app.getBean("stuconf");
        stu.printMessage("hello");

    }
}
