package com.pluralsight.NorthwindTradersAPI.models;

public class Product {
    private int productId, categoryId;
    private String productName;
    private double unitPrice;

    public Product(int productId, int categoryId, String productName, double unitPrice) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
