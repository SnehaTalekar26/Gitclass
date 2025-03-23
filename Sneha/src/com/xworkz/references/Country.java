package com.xworkz.references;

public class Country {
    String name="India";
    String continent="Asia";
    int countryCode=91;
    int states=28;

    PrimeMinister pm=new PrimeMinister();

    void display(){
        System.out.println("Country Details");
        System.out.println("Country Name:"+name);
        System.out.println("Country Continent:"+continent);
        System.out.println("Country Telephone Code"+countryCode);
        System.out.println("Country States"+states);
        System.out.println("-------------------------");
        if(pm!=null){
            pm.pmDisplay();
        }
        else
            System.err.println("Pointing to null");
    }
}
