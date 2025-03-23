package com.xworkz.references;

public class City {
    String cityName;
    Ward[] ward;

    City(String cityName,Ward[] ward){
        this.cityName=cityName;
        this.ward=ward;
    }

    void cityDisplay(){
        System.out.println("City Name:"+cityName);
        for(Ward ref:ward){
            if(ref!=null){
                ref.wardDisplay();
            }
            else
                System.err.println("Pointing to null");
        }
    }
}
