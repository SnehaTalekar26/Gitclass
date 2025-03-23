package com.xworkz.references;

public class PrimeMinister {
    Personnel personnel=new Personnel("Vasu",
            new Skill("Java",
                    new Experience[]{new ExperienceDetail(
                            new Company("Wipro","Banglore"),
                            "Coder",4,
                            new Education[]{new Education("Engineering","VTU")},
                            new House(new Portfolio[]{new Portfolio(new Details(04,"March",2003),"Male",7902837148L)},"Antellia",
                                    new HouseKeep[]{new HouseKeep("Shanti",
                                            new Transport("Van"))},
                                    new Room[]{new Room("AC",4001),
                                            new Room("NON AC",1001)}))
            })),new States("Karnataka",new District[]){new District("UttarKannada",new City[]{
            new City("Karwar",new Ward({(9),new Ward(1)}),
            new City("Bhatkal",new Ward[]{new Ward(11),new Ward(2)}))
    });}
    )
}

