package com.xworkz.references;

public class Security {
    int securityCode;
    Personnel personnel;

    public Security(int securityCode,Personnel personnel){
        this.securityCode=securityCode;
        this.personnel=personnel;
    }

    public void securityDisplay(){
        System.out.println("Security Code:"+this.securityCode);

        if(this.personnel!=null){
            this.personnel.personnelDisplay();
        }
        else
            System.err.println("Pointing to null");
    }
}

