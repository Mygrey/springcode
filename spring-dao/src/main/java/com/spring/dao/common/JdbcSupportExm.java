package com.spring.dao.common;

import com.spring.dao.customer.Customer;
import com.spring.dao.customer.CustomerDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * 通过JdbcDaoSupport方式操作数据库
 * 不用初始化DataSource
 * JdbcTemplate可以通过getJdbcTemplate()直接获取
 */
public class JdbcSupportExm extends JdbcDaoSupport implements CustomerDao {
    //no need to set datasource here
    @Override
    public void insert(Customer customer) {

        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        getJdbcTemplate().update(sql, new Object[]{customer.getId(),customer.getName(), customer.getAge()
        });
    }

    @Override
    public Customer findById(int id) {
        String sql="select * from customer where cust_id= ?";
        org.springframework.jdbc.core.RowMapper<Customer> rowMapper=new BeanPropertyRowMapper<Customer>(Customer.class);
        Customer customer = getJdbcTemplate().queryForObject(sql,rowMapper,id);
       // List<Customer> list = getJdbcTemplate().query(sql,rowMapper);
        return customer;
    }
}
