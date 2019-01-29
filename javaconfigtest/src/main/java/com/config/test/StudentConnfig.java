package com.config.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 使用javaconfig可以在代码中直接注册bean，而不用配置xml文件
 * 注解@Bean只能用于方法上，且返回类型必须是一个对象
 */

@Configuration
public class StudentConnfig {

    @Bean(name="stuconf")
    public Student getStudent(){
       return new Student();
    }
}
