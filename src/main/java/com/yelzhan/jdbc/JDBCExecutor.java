package com.yelzhan.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExecutor {
    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost", "customer", "yelzhan", "password");
        try {
            Connection connection = dcm.getConnecion();;
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(1000);
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}