package com.pluralsight.NorthWindsTradersApi.model;

public class Product {
    private int productId;
    private String productName;
    private int categoryId;
    private double unitPrice;

    public Product(int productId, String productName, int categoryId, double unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }
}
