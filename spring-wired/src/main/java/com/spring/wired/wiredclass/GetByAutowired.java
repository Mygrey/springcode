package com.spring.wired.wiredclass;

import com.spring.wired.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 通过@Autowired注解进行自动装配
 * 可用在成员变量或者参数构造函数上
 * 使用@Qualifier()指向具体的bean id，相当于byName装配
 * 注意xml中context的配置
 */
public class GetByAutowired {
    private Student student;

    @Autowired
    public GetByAutowired(Student stu){
        this.student=stu;
    }

    public void getInfo(){
        System.out.println("wired by @Autiwired");
        this.student.printInfo();
    }
}
