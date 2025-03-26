package com.xworkz.references;

public class Education {
    String degree;
    String university;

    Education(String degree,String university){
        this.degree=degree;
        this.university=university;
    }

    void educationDisplay(){
        System.out.println("Education Details:");
        System.out.println("Education Degree:"+this.degree);
        System.out.println("Education University:"+this.university);
    }
}
