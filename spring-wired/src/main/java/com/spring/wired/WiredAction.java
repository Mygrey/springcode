package com.spring.wired;

import com.spring.wired.wiredclass.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WiredAction {
    public static void main(String[] args) {
        ApplicationContext app =new ClassPathXmlApplicationContext("people.xml");
        GetPeopleInfo gpi = (GetPeopleInfo) app.getBean("getInfo_nomal");
        GetByType gbt = (GetByType) app.getBean("getInfo_bytype");
        GetByConstruct gbc = (GetByConstruct) app.getBean("getInfo_construct");
        GetByAutowired gba = (GetByAutowired) app.getBean("getInfo_Autowired");
        GetByName gbn = (GetByName) app.getBean("getInfo_byname");
        gpi.getInfo();
        gbt.getInfo();
        gbc.getInfo();
        gba.getInfo();
        gbn.getInfo();
    }
}
