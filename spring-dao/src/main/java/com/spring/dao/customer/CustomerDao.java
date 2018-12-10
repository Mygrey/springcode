package com.spring.dao.customer;

public interface CustomerDao {
    public void insert(Customer customer);
    public Customer findById(int id);
}
