package com.xworkz.Sneha;

class Runner {
    public static void main(String[] args) {
        Display display=new Display();
        Shop shop=new Shop();
        shop.ads(display);
        System.out.println("---------------------------");
        
        Poster poster=new Poster();
        Theater theater=new Theater();
        theater.show(poster);
        System.out.println("---------------------------");

        Team team=new Team();
        RCB rcb=new RCB();
        rcb.showStats(team);
        System.out.println("---------------------------");

        SpaceObject spaceObject=new SpaceObject();
        Space space=new Space();
        space.showSpace(spaceObject);
        System.out.println("---------------------------");

        Engine engine=new Engine();
        Rocket rocket=new Rocket();
        rocket.launch(engine);
        System.out.println("---------------------------");

        Medicine medicine=new Medicine();
        Dolo650 dolo650=new Dolo650();
        dolo650.consume(medicine);
        System.out.println("---------------------------");

        Customer customer=new Customer();
        Barber barber=new Barber();
        barber.cutHair(customer);
        System.out.println("---------------------------");

        Photo photo=new Photo();
        Camera camera=new Camera();
        camera.capture(photo);
        System.out.println("---------------------------");

        Fruit fruit=new Fruit();
        Mango mango=new Mango();
        mango.eat(fruit);
        System.out.println("---------------------------");

        Person person=new Person();
        Pillow pillow=new Pillow();
        pillow.sleep(person);
    }
}
