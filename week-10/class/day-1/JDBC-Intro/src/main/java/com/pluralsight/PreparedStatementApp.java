package com.pluralsight;

import java.sql.*;

public class PreparedStatementApp {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/northwind";
        String user = args[0]; // Replace with your username
        String password = args[1];

        String query = "SELECT * FROM Products WHERE ProductName = ? OR ProductID = ?";
        try {
            // Establishing connection
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, "Tiger Blood");
            statement.setInt(2, 20);

            // Executing query
            ResultSet results = statement.executeQuery();

            // Processing the result set
            while (results.next()) {
                // Replace with your column names and types
                System.out.println(results.getString(2));
            }

            // Closing resources
            results.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
