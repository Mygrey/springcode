package com.spring.dao.common;

import com.spring.dao.customer.Customer;
import com.spring.dao.customer.CustomerDao;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
   private DataSource dataSource;



    /**
     * 通过extends JdbcDaoSupport 可以不用设置DataSource
     * @param dataSource
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(Customer customer) {
        String sql="insert into customer(cust_id,name,age) values(?,?,?)";
        Connection conn=null;

        try {
            conn=dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,customer.getId());
            ps.setString(2,customer.getName());
            ps.setInt(3,customer.getAge());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }


    }

    @Override
    public Customer findById(int id) {

        String sql="select * from customer where cust_id= ?";
        Connection conn=null;
        Customer customer=null;
        try {
            conn=dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet result=ps.executeQuery();
            if(result.next()){
                customer=new Customer(result.getInt("cust_id"),
                        result.getString("name"),result.getInt("age"));
            }
            result.close();
            ps.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(conn!=null){
                try{
                    conn.close();
                }catch (SQLException e){ e.printStackTrace();}
            }
        }
        return customer;
    }

    /**
     * 通过JdbcTemplate方式进行插入，简化代码
     * @param customer
     */
    public void insertByTemplate(Customer customer){
        String sql="insert into customer(cust_id,name,age) values(?,?,?)";
        JdbcTemplate temp = new JdbcTemplate(dataSource);
        temp.update(sql,new Object[]{customer.getId(),customer.getName(),customer.getAge()});
    }

}
