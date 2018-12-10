package com.spring.wired;

import com.spring.wired.common.People;

public class Student implements People {
    private String name;
    private int age;
    private String sex;

    public Student(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    @Override
    public void printInfo() {
        System.out.println(name+"    "+age+"    "+sex);
    }
}
