package com.xworkz.references;

public class City {
    String cityName;
    Ward[] wards;

    City(String cityName,Ward[] ward){
        this.cityName=cityName;
        this.wards=wards;
    }

    public void cityDisplay(){
        System.out.println("City Name:"+cityName);
        for(Ward ref:wards){
            if(ref!=null){
                ref.wardDisplay();
            }
            else
                System.err.println("Pointing to null");
        }
    }
}
