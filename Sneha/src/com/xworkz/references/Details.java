package com.xworkz.references;

public class Details {
    int birthDate;
    String birthMonth;
    int birthYear;

    Details(int birthDate,String birthMonth,int birthYear){
        this.birthDate=birthDate;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
    }

    void detailsDisplay(){
        System.out.println("Details:");
        System.out.println("Birth Date:"+this.birthDate);
        System.out.println("Birth Month:"+this.birthMonth);
        System.out.println("Birth Year:"+this.birthYear);
    }
}
