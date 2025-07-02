package com.ecommerce.simplewebapp.model;

public class Product {
    private int prodid;
    private String prodname;
    private int price;

    public Product(int price, String prodname, int prodid) {
        this.price = price;
        this.prodname = prodname;
        this.prodid = prodid;
    }
    public int getProdid() {
        return prodid;
    }

    public String getProdname() {
        return prodname;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodid=" + prodid +
                ", prodname='" + prodname + '\'' +
                ", price=" + price +
                '}';
    }
}

