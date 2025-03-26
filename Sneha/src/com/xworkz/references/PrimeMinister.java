package com.xworkz.references;

public class PrimeMinister {
    Personnel personnel1=new Personnel("Vasu",
            new Skill("Java",
                    new Experience[]{new Experience(new ExperienceDetail(
                            new Company("Wipro","Banglore"),
                            "Coder",4,
                            new Education[]{new Education("Engineering","Vtu")},
                            new House(new Portfolio[]{new Portfolio(new Details(04,"March",2003),"Male", 7902837148L)},"Antellia",
                                    new HouseKeep[]{new HouseKeep("Das",
                                            new Transport("Van"))},new Room[]{new Room("AC",4001),
                                    new Room("NON AC",1001)})
                    ))}),new States(
            "Karnataka",new District[]{new District("UttarKannada",new City[]{
            new City("Karwar",new Ward[]{new Ward(9),new Ward(1)}),
            new City("Bhatkal",new Ward[]{new Ward(11),new Ward(2)})})
    }));






    Personnel personnel2=new Personnel("Ram",
            new Skill("Counting",
                    new Experience[]{new Experience(new ExperienceDetail(
                            new Company("L&T","USA"),
                            "Accountant",2,
                            new Education[]{new Education("MBA","IIT")},
                            new House(new Portfolio[]{new Portfolio(new Details(29,"Febraury",2002),"Male",9846792963L)},"Mannat",
                                    new HouseKeep[]{new HouseKeep("Ashu",
                                            new Transport("Bus"))}, new Room[]{new Room("AC",4001),
                                    new Room("Ward room",141)})
                    ))}),new States(
            "Karnataka",new District[]{new District("Dakshnina Kannada",new City[]{
            new City("Mangalore",new Ward[]{new Ward(10),new Ward(11)}),
            new City("Udupi",new Ward[]{new Ward(101),new Ward(102)})})
    }));


    PersonalAssistant[] p1=new PersonalAssistant[]{
            new PersonalAssistant("John",23,50000,5,new Security(4001,personnel1))
    };
    PersonalAssistant[] p2=new PersonalAssistant[]{
            new PersonalAssistant("Rahul",25,50000,5,new Security(5001,personnel2))
    };


    Minister min1= new Minister("Niramala","Tamilnadu",
            "FinanceMinister",500000,p1);
    Minister min2= new Minister("Siddaramaih","Karnataka", "Chief Minister",100000,p2);
    Minister[] min={min1,min2};


    String pmNAme="Narendra Modi";
    String party="BJP";
    int age=75;
    float salary=1.2f;


    void pmDisplay(){
        System.out.println("PM name "+pmNAme);
        System.out.println("PM party "+party);
        System.out.println("PM age "+age);
        System.out.println("PM salary "+salary);
        System.out.println("================================================");
        for(Minister ref:min){
            if(ref!=null){
                ref.ministerDisplay();
            }else System.err.println("Pointing to null");
        }
    }
}