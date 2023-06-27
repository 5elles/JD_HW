package com.academy.burtsevich.lesson20.store;

public class Category {
    private String categoryName;

    private Product[] products;

    public Category(String categoryName, Product[] products) {
        this.categoryName = categoryName;
        this.products = products;
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
