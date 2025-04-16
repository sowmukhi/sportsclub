package com.neoteric.basics;

import java.sql.*;

public class MySQL {
    // Method to insert a new employee record into the EMPLOYEE table
    public static void insertEmployee(String empId, String empName, String department, double salary) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/basics";
        String username = "root";
        String password = "Sow@5555";

        String insertQuery = "INSERT INTO EMPLOYEE (empId, empName, department, salary) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {

            pstmt.setString(1, empId);
            pstmt.setString(2, empName);
            pstmt.setString(3, department);
            pstmt.setDouble(4, salary);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }

        } catch (SQLException e) {
            System.err.println("Insert failed.");
            e.printStackTrace();
        }
    }

    // Method to fetch and display all employee records from the EMPLOYEE table
    public static void fetchAllEmployees() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/basics";
        String username = "root";
        String password = "Sow@5555";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            if (connection != null) {
                System.out.println("\nConnected to the MySQL database successfully!");
            }

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

            System.out.println("\n EMPLOYEE RECORDS:");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getString("empId"));
                System.out.println("Name: " + resultSet.getString("empName"));
                System.out.println("Department: " + resultSet.getString("department"));
                System.out.println("Salary: " + resultSet.getString("salary"));
                System.out.println("--------------");
            }
        } catch (SQLException e) {
            System.err.println("Failed to fetch data.");
            e.printStackTrace();
        }
    }
}
