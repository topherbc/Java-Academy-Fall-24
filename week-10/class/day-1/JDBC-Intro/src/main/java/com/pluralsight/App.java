package com.pluralsight;

import java.sql.*;
import javax.sql.DataSource;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // load the MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 1. open a connection to the database
        // use the database URL to point to the correct database
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "        ");
        // create statement
        // the statement is tied to the open connection
        Statement statement = connection.createStatement();
        // define your query
        String query = "SELECT ProductName FROM Products ";
        // 2. Execute your query
        ResultSet results = statement.executeQuery(query);
        // process the results
        while (results.next()) {
            String name = results.getString("ProductName");
            System.out.println(name);
        }
        // 3. Close the connection
        connection.close();


    }
}
