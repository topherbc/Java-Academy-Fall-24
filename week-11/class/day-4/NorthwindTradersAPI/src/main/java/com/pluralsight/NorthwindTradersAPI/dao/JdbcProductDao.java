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
public class JdbcProductDao implements ProductDao {

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

    @Override
    public Product insert(Product product) {
        Product createdProduct = null;
        String sql = "INSERT INTO products (categoryId, productName, unitPrice) VALUES (?, ?, ?)";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setInt(1, product.getCategoryId());
            statement.setString(2, product.getProductName());
            statement.setDouble(3, product.getUnitPrice());

            statement.executeUpdate();

            // Retrieve the generated key
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if(generatedKeys.next()) {
                createdProduct = getById(generatedKeys.getInt(1));
            }
        }
        catch (SQLException e) {
           e.printStackTrace();
        }
        return createdProduct;
    }

    @Override
    public boolean update(int id, Product product) {
        int productNamePos = 0;
        int categoryIdPos = 0;
        int unitPricePos = 0;
        int idPos = 0;
        String updateParamStatement = "";
        if(product.getProductName() != null) {
            productNamePos+=1;
            idPos++;
            updateParamStatement+=" productName=? ";
        }

        if(product.getCategoryId() != 0) {
            categoryIdPos+=productNamePos+1;
            idPos++;
            String comma = "";
            if (updateParamStatement.length() > 0) {
                comma=",";
            }
            updateParamStatement+=comma+" categoryId=? ";
        }

        if(product.getUnitPrice() != 0.0) {
            unitPricePos+=categoryIdPos+productNamePos+1;
            idPos++;
            String comma = "";
            if (updateParamStatement.length() > 0) {
                comma=",";
            }
            updateParamStatement+=comma+" unitPrice=? ";
        }

        String sql = "UPDATE products SET " + updateParamStatement + " WHERE ProductID=?";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);

            // if we don't have 1 or more property populated, call getById to populate
            System.out.println(product);

            if(product.getProductName() != null) {
                statement.setString(productNamePos, product.getProductName());
            }
            
            if(product.getCategoryId() != 0) {
                statement.setInt(categoryIdPos, product.getCategoryId());
            }

            if(product.getUnitPrice() != 0.0) {
                statement.setDouble(unitPricePos, product.getUnitPrice());
            }

            statement.setInt(idPos+1, id);

            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
