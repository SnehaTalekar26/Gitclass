package com.xworkz.Latent.internal;

public class ConnectorImpl implements Connector{
    @Override
    public void run(){
        System.out.println("ConnectorImpl is running in Connector");
    }
    public ConnectorImpl(){
        System.out.println("Running ConnectorImpl const");
    }
}
