package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;

public class App {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("We have a problem, please provide a username and password");
            System.exit(1);
        }

        String url = "jdbc:mysql://127.0.0.1:3306/northwind";
        String user = args[0]; // Replace with your username
        String password = args[1];

        String query = "SELECT * FROM Products";

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        try (// Establishing connection
             Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
        ) {
            try (// Executing query
                 ResultSet results = statement.executeQuery()
            ) {
                // Processing the result set
                System.out.println("Id   Name                             Price  Stock      \n---- -------------------------------- ------ ------ \n");
                while (results.next()) {
                    // Replace with your column names and types
                    String id = formatSpaces(results.getString(1), 4);
                    String name = formatSpaces(results.getString("ProductName"), 32);
                    Double price = results.getDouble("UnitPrice");
                    String inStock = results.getString("UnitsInStock");

                    //Stacked Info:
//                System.out.printf("Product Id: %s \nName: %s \nPrice: %.2f \nStock: %s\n\n------------------\n\n", id, name, price, inStock);
                    //Row Info:
                    System.out.printf("%s %s %.2f  %s  \n", id, name, price, inStock);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String formatSpaces(String v, int maxLength) {
        String newV = v;
        for (int i = 0; i < maxLength - v.length(); i++) {
            newV += " ";
        }
        return newV;
    }
}
