package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Connector;
import com.xworkz.Latent.internal.ConnectorImpl;

public class ConnectorUser {
    private Connector connector;

    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("Running arg const");
    }
    public void execute(){
        if(connector!=null){
            this.connector.run();
        }
        else{
            System.out.println("Null");
        }
    }
}
