package com.spring.dao;

import com.spring.dao.common.CustomerDaoImpl;
import com.spring.dao.customer.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAction {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("customer.xml");
        CustomerDaoImpl cdi = (CustomerDaoImpl) app.getBean("customerBean");
        Customer cust = new Customer(2,"sam",26);
        //cdi.insert(cust);
        System.out.println("success!");
        Customer result = cdi.findById(2);
        System.out.println(result.getName());
    }
}
