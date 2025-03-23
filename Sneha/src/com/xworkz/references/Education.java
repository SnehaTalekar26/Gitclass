package com.xworkz.references;

public class Education {
    String university;
    String degree;

    Education(String university,String degree){
        this.university=university;
        this.degree=degree;
    }

    void educationDisplay(){
        System.out.println("Education University:"+this.university);
        System.out.println("Education Degree:"+this.degree);
    }
}
