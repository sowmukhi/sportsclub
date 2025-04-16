package com.neoteric.basics;

import java.sql.*;

import static com.neoteric.basics.MySQL.fetchAllEmployees;
import static com.neoteric.basics.MySQL.insertEmployee;


public class MySQLConnector {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/basics";
        String username = "root";
        String password = "Sow@5555";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (connection != null) {
                System.out.println("Connected to the MySQL database successfully!");
            }
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM EMPLOYEE");
            while (resultSet.next()){
                System.out.println(resultSet.getString("empId"));
                System.out.println(resultSet.getString("empName"));
                System.out.println(resultSet.getString("department"));
                System.out.println(resultSet.getString("salary"));
            }
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database.");
            e.printStackTrace();
        }
        // Insert a new employee
        insertEmployee("15", "Aadi", "IT", 47000);

        // Fetch all employee records
        fetchAllEmployees();
    }
}
