package com.bjpowernode.bean;

public class Product {
    private int id;
    private String productname;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Product() {
    }

    public Product(int id, String productname) {
        this.id = id;
        this.productname = productname;
    }
}
