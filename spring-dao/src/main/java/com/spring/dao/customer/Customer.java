package com.spring.dao.customer;

public class Customer {
    int id;
    String name;
    int age;

public  Customer(int idValue,String nameValue,int ageValue){
    this.id=idValue;
    this.name=nameValue;
    this.age=ageValue;
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
