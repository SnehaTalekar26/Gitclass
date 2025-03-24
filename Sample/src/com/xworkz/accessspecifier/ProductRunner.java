package com.xworkz.accessspecifier;

public class ProductRunner {
    public static void main(String[] args){
        System.out.println("Running Product Runner");
        Product product=new Product();
        product.sellProduct();
        product.buy();
        product.checkProduct();
    }
}
