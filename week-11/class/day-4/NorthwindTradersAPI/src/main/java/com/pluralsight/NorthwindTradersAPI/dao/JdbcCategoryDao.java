package com.pluralsight.NorthwindTradersAPI.dao;


import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcCategoryDao implements CategoryDao {

    private DataSource dataSource;
    private List<Product> products;

    @Autowired
    public JdbcProductDao(DataSource dataSource){
        this.dataSource = dataSource;
        this.products = new ArrayList<>();
    }

    @Override
    public List<Product> getAll() {
        this.products.clear();
        String sql = "SELECT productId, categoryId, productName, unitPrice FROM products;";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                this.products.add(new Product(rows.getInt(1), rows.getInt(2), rows.getString(3),rows.getDouble(4)));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return this.products;
    }

    @Override
    public Product getById(int id) {
        Product product = null;
        String sql = "SELECT productId, categoryId, productName, unitPrice FROM products WHERE productId = ?;";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                product = new Product(rows.getInt(1), rows.getInt(2), rows.getString(3),rows.getDouble(4));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return product;
    }
}
