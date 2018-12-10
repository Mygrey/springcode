package com.spring.wired.wiredclass;

import com.spring.wired.Teacher;


/**
 * 同样必须有set方法
 * 成员变量名称可以和xml中的bean的id匹配上。
 */
public class GetByName {
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void getInfo(){
        System.out.println("wired by name");
        this.teacher.printInfo();
    }


}
