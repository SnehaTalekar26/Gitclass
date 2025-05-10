package com.xworkz.accessspecifier;

public class Product {
    public String productName="Sunscreen";
    int productPrice=400;
    private String productType="Box";

    public void sellProduct(){
        System.out.println("Name of the product:"+productName);
    }
    void buy(){
        System.out.println("Price of the product:"+productPrice);
    }
    private void look(){
        System.out.println(productType);
    }
    void checkProduct(){
        System.out.println("Type of the product packed:"+productType);
    }
}
