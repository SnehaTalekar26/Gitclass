package com.xworkz.references;

public class Experience {
    ExperienceDetail experienceDetail;

    Experience(ExperienceDetail experienceDetail){
        this.experienceDetail=experienceDetail;
    }

    void experienceDetail(){
        System.out.println("Experience Details:");

        if(this.experienceDetail!=null){
            this.experienceDetail.expDisplay();
        }
        else
            System.err.println("Pointing to null");
    }
}
