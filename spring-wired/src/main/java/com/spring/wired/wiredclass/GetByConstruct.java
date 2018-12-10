package com.spring.wired.wiredclass;

import com.spring.wired.Teacher;

public class GetByConstruct {
    private Teacher teacher;

    public GetByConstruct(Teacher teacher){
        this.teacher=teacher;
    }

    /**
     * 通过带参数构造函数方式进行自动装配，
     * 不能同时存在set方法，否则会报错
     */
    public void getInfo(){
        System.out.println("wired by construct with param");
        this.teacher.printInfo();
    }
}
