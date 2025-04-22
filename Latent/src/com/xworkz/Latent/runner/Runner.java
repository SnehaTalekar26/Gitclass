package com.xworkz.Latent.runner;

import com.xworkz.Latent.external.*;
import com.xworkz.Latent.internal.*;

public class Runner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImpl();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();

        System.out.println("----------1-----------");

        Icc icc=new IndianCricketTeam();
        BCCIUser bcciUser=new BCCIUser(icc);
        bcciUser.Ipl();

        System.out.println("----------2-----------");

        Constitution constitution=new CitizenConstitutionImpl();
        Government government=new Government(constitution);
        government.law();

        System.out.println("----------3-----------");

        Laptop laptop=new LaptopImpl();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.chip();

        System.out.println("----------4-----------");

        Chocolate chocolate=new ChocolateImpl();
        DairyMilk dairyMilk=new DairyMilk(chocolate);
        dairyMilk.melt();

        System.out.println("----------5-----------");

        Charger charger=new ChargerImpl();
        Socket socket=new Socket(charger);
        socket.Switch();

        System.out.println("----------6-----------");

        House house=new HouseImpl();
        Building building=new Building(house);
        building.rooms();

        System.out.println("----------7-----------");

        Food food=new FoodImpl();
        Restaurant restaurant=new Restaurant(food);
        restaurant.prepare();

        System.out.println("----------8-----------");

        Book book=new BookImpl();
        Author author=new Author(book);
        author.publish();

        System.out.println("----------9-----------");

        Bag bag=new BagImpl();
        Compartments compartments=new Compartments(bag);
        compartments.cover();

        System.out.println("----------10-----------");
    }
}
