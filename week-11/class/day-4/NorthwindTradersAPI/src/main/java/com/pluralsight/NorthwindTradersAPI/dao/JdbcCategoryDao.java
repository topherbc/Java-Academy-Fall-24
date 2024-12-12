package com.pluralsight.NorthwindTradersAPI.dao;


import com.pluralsight.NorthwindTradersAPI.models.Category;
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
    private List<Category> categories;

    @Autowired
    public JdbcCategoryDao(DataSource dataSource){
        this.dataSource = dataSource;
        this.categories = new ArrayList<>();
    }

    @Override
    public List<Category> getAll() {
        this.categories.clear();
        String sql = "SELECT categoryId, categoryName FROM categories;";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                this.categories.add(new Category(rows.getInt(1), rows.getString(2)));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return this.categories;
    }

    @Override
    public Category getById(int id) {
        Category category = null;
        String sql = "SELECT categoryId, categoryName  FROM categories WHERE categoryId = ?;";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                category = new Category(rows.getInt(1), rows.getString(2));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return category;
    }

    @Override
    public boolean insert(Category category) {
        String sql = "INSERT INTO categories (categoryId, categoryName) VALUES (?, ?)";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, category.getCategoryId());
            statement.setString(2, category.getCategoryName());

            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
