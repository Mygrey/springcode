package com.spring.wired.wiredclass;

import com.spring.wired.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


public class GetByType {

/**byType方式自动装配
 * 必须要有set方法
 *
 * */
    private  Student stu;

    public void setStu(Student stu) {
        this.stu = stu;
    }


   public void getInfo(){
       System.out.println("wired by type!");
       this.stu.printInfo();
   }
}
