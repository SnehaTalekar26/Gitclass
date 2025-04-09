package com.xworkz.Task.Runner;

import com.xworkz.Task.Internal.*;
import javafx.scene.control.Tab;
import sun.security.provider.Sun;

import java.sql.Ref;

public class Runner {
    public static void main(String[] args) {
        Physics physics=new Physics(12,18,4);
        System.out.println("Physics Details:"+physics);

        System.out.println("1-----------------------");

        Finance finance=new Finance(12,18,4);
        System.out.println("Finance Details:"+finance);

        System.out.println("2-----------------------");

        Geometry geometry=new Geometry(12,18,4);
        System.out.println("Geometry Details:"+geometry);

        System.out.println("3-----------------------");

        Programming programming=new Programming(1,10,4);
        System.out.println("Programming Details:"+programming);

        System.out.println("4-----------------------");

        Cooking cooking=new Cooking(10,6,2);
        System.out.println("Cooking Details:"+cooking);

        System.out.println("5-----------------------");

        Chemistry chemistry=new Chemistry(10,6,24);
        System.out.println("Chemistry Details:"+chemistry);

        System.out.println("6-----------------------");

        Cricket cricket=new Cricket(100,60,24);
        System.out.println("Cricket Details:"+cricket);

        System.out.println("7-----------------------");

        Shopping shopping=new Shopping(100,200,400);
        System.out.println("Shopping Details:"+shopping);

        System.out.println("8-----------------------");

        Dice dice=new Dice(4,2,3);
        System.out.println("Dice Details:"+dice);

        System.out.println("9-----------------------");

        Electricity electricity=new Electricity(4,2,3);
        System.out.println("Electricity Details:"+electricity);

        System.out.println("10-----------------------");

        Internet internet=new Internet(4,2,3);
        System.out.println("Internet Details:"+internet);

        System.out.println("11-----------------------");

        Salary salary=new Salary(4000,2000,6000);
        System.out.println("Salary Details:"+salary);

        System.out.println("12-----------------------");

        Family family=new Family(40,38,16);
        System.out.println("Family Details:"+family);

        System.out.println("13-----------------------");

        Bank bank=new Bank(40,38,16);
        System.out.println("Bank Details:"+bank);

        System.out.println("14-----------------------");

        Laptop laptop=new Laptop("HP",38,16);
        System.out.println("Laptop Details:"+laptop);

        System.out.println("15-----------------------");

        Book book=new Book("Atomic Habits","James Clear",30);
        System.out.println("Book Details:"+book);

        System.out.println("16-----------------------");

        Car car=new Car("BMW","black",10);
        System.out.println("Car Details:"+car);

        System.out.println("17-----------------------");

        Game game=new Game("UNO","card",10);
        System.out.println("Game Details:"+game);

        System.out.println("18-----------------------");

        Movie movie=new Movie("Chennai Express","Rohit Shetty",1);
        System.out.println("Movie Details:"+movie);

        System.out.println("19-----------------------");

        Song song=new Song("Sanam teri Kasam","Ankit Tiwari",1);
        System.out.println("Song Details:"+song);

        System.out.println("20-----------------------");

        Puzzle puzzle=new Puzzle("word","medium",true);
        System.out.println("Puzzle Details:"+puzzle);

        System.out.println("21-----------------------");

        Student student=new Student("Sneha",21,"A");
        System.out.println("Student Details:"+student);

        System.out.println("22-----------------------");

        EscapeRoom escapeRoom=new EscapeRoom("Thriller",4,30);
        System.out.println("EscapeRoom Details:"+escapeRoom);

        System.out.println("23-----------------------");

        Chess chess=new Chess("Sneha","Sarthak",30);
        System.out.println("Chess Details:"+chess);

        System.out.println("24-----------------------");

        Painting painting=new Painting("Mandala","Sneha","");
        System.out.println("Painting Details:"+painting);

        System.out.println("25-----------------------");

        Recipe recipe=new Recipe("Pasta",3,2);
        System.out.println("Recipe Details:"+recipe);

        System.out.println("26-----------------------");

        TimeMachine timeMachine=new TimeMachine("2030","Sneha",10);
        System.out.println("TimeMachine Details:"+timeMachine);

        System.out.println("27-----------------------");

        DreamLog dreamLog=new DreamLog("Happy","happy",2);
        System.out.println("DreamLog Details:"+dreamLog);

        System.out.println("28-----------------------");

        TreasureHunt treasureHunt=new TreasureHunt("College","Canteen",4);
        System.out.println("TreasureHunt Details:"+treasureHunt);

        System.out.println("29-----------------------");

        Alien alien=new Alien("Ananya","Mars",2);
        System.out.println("Alien Details:"+alien);

        System.out.println("30-----------------------");

        SuperPower superPower=new SuperPower("Vanish","magic",2);
        System.out.println("SuperPower Details:"+superPower);

        System.out.println("31-----------------------");

        SecretMission secretMission=new SecretMission("ASAP","Nothing",4);
        System.out.println("SecretMission Details:"+secretMission);

        System.out.println("32-----------------------");

        WaterBottle waterBottle=new WaterBottle("Milton",3,true);
        System.out.println("WaterBottle Details:"+waterBottle);

        System.out.println("33-----------------------");

        Notebook notebook=new Notebook("Science",30,true);
        System.out.println("Notebook Details:"+notebook);

        System.out.println("34-----------------------");

        Backpack backpack=new Backpack("Nike",3,true);
        System.out.println("Backpack Details:"+backpack);

        System.out.println("35-----------------------");

        Table table=new Table("Wooden",13,false);
        System.out.println("Table Details:"+table);

        System.out.println("36-----------------------");

        HeadPhones headPhones=new HeadPhones("Sony",true,80);
        System.out.println("Headphones Details:"+headPhones);

        System.out.println("37-----------------------");

        Shoes shoes=new Shoes("Puma","Casual",39);
        System.out.println("Shoes Details:"+shoes);

        System.out.println("38-----------------------");

        Keyboard keyboard=new Keyboard("wireless",false,"");
        System.out.println("Keyboard Details:"+keyboard);

        System.out.println("39-----------------------");

        Fan fan=new Fan("Havells",3,true);
        System.out.println("Fan Details:"+fan);

        System.out.println("40-----------------------");

        Watch watch=new Watch("Firebolt",true,3000);
        System.out.println("Watch Details:"+watch);

        System.out.println("41-----------------------");

        Television television=new Television("Haier",30,true);
        System.out.println("Television Details:"+television);

        System.out.println("42-----------------------");

        Refrigerator refrigerator=new Refrigerator("LG",3,true);
        System.out.println("Refrigerator Details:"+refrigerator);

        System.out.println("43-----------------------");

        Microwave microwave=new Microwave("Haier",3,true);
        System.out.println("Microwave Details:"+microwave);

        System.out.println("44-----------------------");

        Bicycle bicycle=new Bicycle("sports",3,true);
        System.out.println("Bicycle Details:"+bicycle);

        System.out.println("45-----------------------");

        Printer printer=new Printer("HP",true,2);
        System.out.println("Printer Details:"+printer);

        System.out.println("46-----------------------");

        Camera camera=new Camera("Canon",3,true);
        System.out.println("Camera Details:"+camera);

        System.out.println("47-----------------------");

        DeskLamp deskLamp=new DeskLamp("yellow",3,true);
        System.out.println("DeskLamp Details:"+deskLamp);

        System.out.println("48-----------------------");

        Speaker speaker=new Speaker("Bose",3,false);
        System.out.println("Speaker Details:"+speaker);

        System.out.println("49-----------------------");

        Tablet tablet=new Tablet("ipad",3,true);
        System.out.println("Tablet Details:"+tablet);

        System.out.println("50-----------------------");

        AC ac=new AC("Daikin",3,true);
        System.out.println("AC Details:"+ac);

        System.out.println("51-----------------------");

        WashingMachine washingMachine=new WashingMachine("Haier",3,false);
        System.out.println("WashingMachine Details:"+washingMachine);

        System.out.println("52-----------------------");

        Pen pen=new Pen("Cello","black",false);
        System.out.println("Pen Details:"+pen);

        System.out.println("53-----------------------");

        Umbrella umbrella=new Umbrella("purple",false,20);
        System.out.println("Umbrella Details:"+umbrella);

        System.out.println("54-----------------------");

        AlarmClock alarmClock=new AlarmClock("Seiko",true,"yes");
        System.out.println("AlarmClock Details:"+alarmClock);

        System.out.println("55-----------------------");

        Sunglasses sunglasses=new Sunglasses("persol","black",true);
        System.out.println("Sunglasses Details:"+sunglasses);

        System.out.println("56-----------------------");

        WaterHeater waterHeater=new WaterHeater("havells",3,true);
        System.out.println("WaterHeater Details:"+waterHeater);

        System.out.println("57-----------------------");

        Mirror mirror=new Mirror("Round","Fabric",false);
        System.out.println("Mirror Details:"+mirror);

        System.out.println("58-----------------------");

        CoffeeMug coffeeMug=new CoffeeMug("Black",3,false);
        System.out.println("CoffeeMug Details:"+coffeeMug);

        System.out.println("59-----------------------");

        Calender calender=new Calender(2025,"hanging",false);
        System.out.println("Calender Details:"+calender);

        System.out.println("60-----------------------");

        Toothbrush toothbrush=new Toothbrush("Colgate",false,"blue");
        System.out.println("Toothbrush Details:"+toothbrush);

        System.out.println("61-----------------------");

        Mixer mixer=new Mixer("Philips",3,true);
        System.out.println("Mixer Details:"+mixer);

        System.out.println("62-----------------------");

        Iron iron=new Iron("heat",3,false);
        System.out.println("Iron Details:"+iron);

        System.out.println("63-----------------------");

        Oven oven=new Oven("Samsung",3,true);
        System.out.println("Oven Details:"+oven);

        System.out.println("64-----------------------");

        Remote remote=new Remote("TV",true,2);
        System.out.println("Remote Details:"+remote);
        System.out.println("Remote Details:"+remote);

        System.out.println("65-----------------------");

        Cupboard cupboard=new Cupboard(4,"wood",true);
        System.out.println("Cupboard Details:"+cupboard);

        System.out.println("66-----------------------");

        Guitar guitar=new Guitar("Classical",4,"Yamaha");
        System.out.println("Guitar Details:"+guitar);

        System.out.println("67-----------------------");

        Skateboard skateboard=new Skateboard("7-ply",3,false);
        System.out.println("Skateboard Details:"+skateboard);

        System.out.println("68-----------------------");

        Drone drone=new Drone("Ryze Tello",3,true);
        System.out.println("Drone Details:"+drone);

        System.out.println("69-----------------------");

        Projector projector=new Projector("SVGA",3,true);
        System.out.println("Projector Details:"+projector);

        System.out.println("70-----------------------");

        TravelBag travelBag=new TravelBag("Nike",3,true);
        System.out.println("TravelBag Details:"+travelBag);

        System.out.println("71-----------------------");

        WeatherReport weatherReport=new WeatherReport("Bangalore",30,false);
        System.out.println("WeatherReport Details:"+weatherReport);

        System.out.println("72-----------------------");

        MusicTrack musicTrack=new MusicTrack("Tum hi ho","Arijit singh",2);
        System.out.println("MusicTrack Details:"+musicTrack);

        System.out.println("73-----------------------");

        Robot robot=new Robot("Raksha",10,true);
        System.out.println("Robot Details:"+robot);

        System.out.println("74-----------------------");

        MovieTicket movieTicket=new MovieTicket("Chaava","3",200);
        System.out.println("MovieTicket Details:"+movieTicket);

        System.out.println("75-----------------------");

        Pet pet=new Pet("Dog","",16);
        System.out.println("Pet Details:"+pet);

        System.out.println("76-----------------------");

        IceCream iceCream=new IceCream("Butterscotch",3,false);
        System.out.println("IceCream Details:"+iceCream);

        System.out.println("77-----------------------");

        Mountain mountain=new Mountain("Himachal",3,true);
        System.out.println("Mountain Details:"+mountain);

        System.out.println("78-----------------------");

        DreamCatcher dreamCatcher=new DreamCatcher("green",3,false);
        System.out.println("DreamCatcher Details:"+dreamCatcher);

        System.out.println("79-----------------------");

        Spaceship spaceship=new Spaceship("NASA",3,true);
        System.out.println("Spaceship Details:"+spaceship);

        System.out.println("80-----------------------");

        Plant plant=new Plant("Flowering",3,true);
        System.out.println("Plant Details:"+plant);

        System.out.println("81-----------------------");

        Instrument instrument=new Instrument("Violin","String",false);
        System.out.println("Instrument Details:"+instrument);

        System.out.println("82-----------------------");

        Bike bike=new Bike("Honda",5,false);
        System.out.println("Bike Details:"+bike);

        System.out.println("83-----------------------");

        Emoji emoji=new Emoji("smile","smile",true);
        System.out.println("Emoji Details:"+emoji);

        System.out.println("84-----------------------");

        Train train=new Train("IndianExpress",13,true);
        System.out.println("Train Details:"+train);

        System.out.println("85-----------------------");

        Monster monster=new Monster("Nishanth",100,true);
        System.out.println("Monster Details:"+monster);

        System.out.println("86-----------------------");

        Planet planet=new Planet("Earth",9,true);
        System.out.println("Planet Details:"+planet);

        System.out.println("87-----------------------");

        Microscope microscope=new Microscope("Light",3,true);
        System.out.println("Microscope Details:"+microscope);

        System.out.println("88-----------------------");

        Whiteboard whiteboard=new Whiteboard("Medium",false,"Aluminium");
        System.out.println("WhiteBoard Details:"+whiteboard);

        System.out.println("89-----------------------");

        Cooker cooker=new Cooker("Pressure",3,false);
        System.out.println("Cooker Details:"+cooker);

        System.out.println("90-----------------------");

        House house=new House("Karwar",3,true);
        System.out.println("House Details:"+house);

        System.out.println("91-----------------------");

        Tent tent=new Tent(3,"Blue",true);
        System.out.println("Tent Details:"+tent);

        System.out.println("92-----------------------");

        Shop shop=new Shop("Pasta",10,true);
        System.out.println("Shop Details:"+shop);

        System.out.println("93-----------------------");

        Library library=new Library("Greenwood",1000,true);
        System.out.println("Library Details:"+library);

        System.out.println("94-----------------------");

        Restaurant restaurant=new Restaurant("Bangalore",10,true);
        System.out.println("Restaurant Details:"+restaurant);

        System.out.println("95-----------------------");

        Hospital hospital=new Hospital("Xavier",3,true);
        System.out.println("Hospital Details:"+hospital);

        System.out.println("96-----------------------");

        Theater theater=new Theater("Titanic",3,true);
        System.out.println("Theater Details:"+theater);

        System.out.println("97-----------------------");

        Gym gym=new Gym("Thushara",10,false);
        System.out.println("Gym Details:"+gym);

        System.out.println("98-----------------------");

        College college=new College("Prakash",1000,false);
        System.out.println("College Details:"+college);

        System.out.println("99-----------------------");

        Museum museum=new Museum("IDK",30,true);
        System.out.println("Museum Details:"+museum);

        System.out.println("100-----------------------");
    }
}
