package com.spring.wired.wiredclass;

import com.spring.wired.common.People;

public class GetPeopleInfo {
    private People people;

    public GetPeopleInfo(People people){
        this.people=people;
    }

    public void getInfo(){
        System.out.println("nomal wired!");
        this.people.printInfo();
    }

}
