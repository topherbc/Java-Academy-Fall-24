package com.pluralsight.NorthwindTradersAPI.models;

public class Product {
    private int productId, categoryId;
    private String productName;
    private double unitPrice;

    public Product() {
    }

    public Product(int productId, int categoryId, String productName, double unitPrice) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", categoryId=" + categoryId +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
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
