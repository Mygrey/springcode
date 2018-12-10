package com.spring.wired;

import com.spring.wired.common.People;

public class Teacher implements People {
    private String name;
    private String subject;
    private int grade;

    public Teacher(String name,String subject,int grade){
        this.name=name;
        this.subject=subject;
        this.grade=grade;
    }

    @Override
    public void printInfo() {
        System.out.println(name+"    "+subject+"    "+grade);
    }
}
