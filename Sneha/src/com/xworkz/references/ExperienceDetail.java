package com.xworkz.references;

public class ExperienceDetail {
    Company company;
    int expYear;
    String expPosition;
    Education[] education;
    House house;

    ExperienceDetail(Company company,String expPosition,int expYear,Education[] education,House house){
        this.company=company;
        this.expPosition=expPosition;
        this.expYear=expYear;
        this.education=education;
        this.house=house;
    }
    void expDisplay(){
        if(this.company!=null){
            this.company.companyDisplay();
        }
        else
            System.out.println("Experience Position"+this.expPosition);
            System.out.println("Experience Year"+this.expYear);
            for(Education ref:education){
                if(ref!=null){
                    ref.educationDisplay();
                }
                else
                    System.err.println("Pointing to null");
            }
            if(house!=null){
                house.houseDisplay();
            }
            else
                System.err.println("Pointing to null");
    }
}
