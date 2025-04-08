package com.xworkz.Micro.Runner;

import com.sun.org.apache.xerces.internal.impl.xs.util.XSObjectListImpl;
import com.xworkz.Micro.Casting.*;
import com.xworkz.Micro.External.*;
import sun.nio.ch.Net;

public class Runner {
    public static void main(String[] args) {
        Juice juice=new Juice();
        juice.drink();
        juice.buy();
        juice.glass();
        juice.packet();
        juice.pour();

        System.out.println("--------------------------------");

        Juice juice1=new Mango();
        juice1.drink();
        juice1.buy();
        juice1.glass();
        juice1.packet();
        juice1.pour();

        System.out.println("--------------------------------");

        Mango mango=new Mango();
        mango.drink();
        mango.buy();
        mango.glass();
        mango.packet();
        mango.pour();

        System.out.println("--------------------------------");

        Straw straw=new Straw();
        straw.quality(juice);
        straw.quality(mango);

        System.out.println("--------------------------------");

        Plant plant=new Plant();
        plant.grow();
        plant.dead();
        plant.seed();
        plant.dead();
        plant.leaves();

        System.out.println("--------------------------------");

        Plant plant1=new Rose();
        plant1.grow();
        plant1.dead();
        plant1.seed();
        plant1.dead();
        plant1.leaves();

        System.out.println("--------------------------------");

        Rose rose=new Rose();
        rose.grow();
        rose.dead();
        rose.seed();
        rose.dead();
        rose.leaves();

        System.out.println("--------------------------------");

        Grow grow=new Grow();
        grow.water(plant);
        grow.water(rose);

        System.out.println("--------------------------------");

        Sim sim=new Sim();
        sim.buy();
        sim.sell();
        sim.use();
        sim.call();
        sim.connect();

        System.out.println("--------------------------------");

        Sim sim1=new Jio();
        sim1.buy();
        sim1.sell();
        sim1.use();
        sim1.call();
        sim1.connect();

        System.out.println("--------------------------------");

        Jio jio=new Jio();
        jio.buy();
        jio.sell();
        jio.use();
        jio.call();
        jio.connect();

        System.out.println("--------------------------------");

        Network network=new Network();
        network.explore(sim);
        network.explore(jio);

        System.out.println("--------------------------------");

        Jacket jacket=new Jacket();
        jacket.open();
        jacket.close();
        jacket.wash();
        jacket.borrow();
        jacket.wear();

        System.out.println("--------------------------------");

        Jacket jacket1=new Zip();
        jacket1.open();
        jacket1.close();
        jacket1.wash();
        jacket1.borrow();
        jacket1.wear();

        System.out.println("--------------------------------");

        Zip zip=new Zip();
        zip.open();
        zip.close();
        zip.wash();
        zip.borrow();
        zip.wear();

        System.out.println("--------------------------------");

        Leather leather=new Leather();
        leather.put(jacket);
        leather.put(zip);

        System.out.println("--------------------------------");

        Rain rain=new Rain();
        rain.water();
        rain.weather();
        rain.mud();
        rain.raincoat();
        rain.cloud();

        System.out.println("--------------------------------");

        Rain rain1=new Umbrella();
        rain1.water();
        rain1.weather();
        rain1.mud();
        rain1.raincoat();
        rain1.cloud();

        System.out.println("--------------------------------");

        Umbrella umbrella=new Umbrella();
        umbrella.water();
        umbrella.weather();
        umbrella.mud();
        umbrella.raincoat();
        umbrella.cloud();

        System.out.println("--------------------------------");

        Dark dark=new Dark();
        dark.getWet(rain);
        dark.getWet(umbrella);

        System.out.println("--------------------------------");

        Earphone earphone=new Earphone();
        earphone.purchase();
        earphone.connect();
        earphone.mobile();
        earphone.device();
        earphone.share();

        System.out.println("--------------------------------");

        Earphone earphone1=new Bluetooth();
        earphone1.purchase();
        earphone1.connect();
        earphone1.mobile();
        earphone1.device();
        earphone1.share();

        System.out.println("--------------------------------");

        Bluetooth bluetooth=new Bluetooth();
        bluetooth.purchase();
        bluetooth.connect();
        bluetooth.mobile();
        bluetooth.device();
        bluetooth.share();

        System.out.println("--------------------------------");

        Device device=new Device();
        device.deviceConnect(earphone);
        device.deviceConnect(bluetooth);

        System.out.println("--------------------------------");

        Furniture furniture=new Furniture();
        furniture.sketch();
        furniture.build();
        furniture.buy();
        furniture.sell();
        furniture.scratch();

        System.out.println("--------------------------------");

        Furniture furniture1=new Wooden();
        furniture1.sketch();
        furniture1.build();
        furniture1.buy();
        furniture1.sell();
        furniture1.scratch();

        System.out.println("--------------------------------");

        Wooden wooden=new Wooden();
        wooden.sketch();
        wooden.build();
        wooden.buy();
        wooden.sell();
        wooden.scratch();

        System.out.println("--------------------------------");

        Customer customer=new Customer();
        customer.sell(furniture);
        customer.sell(wooden);

        System.out.println("--------------------------------");

        Charger charger=new Charger();
        charger.connection();
        charger.socket();
        charger.phone();
        charger.wire();
        charger.current();

        System.out.println("--------------------------------");

        Charger charger1=new Cpin();
        charger1.connection();
        charger1.socket();
        charger1.phone();
        charger1.wire();
        charger1.current();

        System.out.println("--------------------------------");

        Cpin cpin=new Cpin();
        cpin.connection();
        cpin.socket();
        cpin.phone();
        cpin.wire();
        cpin.current();

        System.out.println("--------------------------------");

        Wire wire=new Wire();
        wire.adopter(charger);
        wire.adopter(cpin);

        System.out.println("--------------------------------");

        Shoes shoes=new Shoes();
        shoes.wear();
        shoes.buy();
        shoes.sell();
        shoes.wash();
        shoes.Carry();

        System.out.println("--------------------------------");

        Shoes shoes1=new Puma();
        shoes1.wear();
        shoes1.buy();
        shoes1.sell();
        shoes1.wash();
        shoes1.Carry();

        System.out.println("--------------------------------");

        Puma puma=new Puma();
        puma.wear();
        puma.buy();
        puma.sell();
        puma.wash();
        puma.Carry();

        System.out.println("--------------------------------");

        Socks socks=new Socks();
        socks.smell(shoes);
        socks.smell(puma);

        System.out.println("--------------------------------");

        Brush brush=new Brush();
        brush.clean();
        brush.shoes();
        brush.purchase();
        brush.wash();
        brush.use();

        System.out.println("--------------------------------");

        Brush brush1=new Colgate();
        brush1.clean();
        brush1.shoes();
        brush1.purchase();
        brush1.wash();
        brush1.use();

        System.out.println("--------------------------------");

        Colgate colgate=new Colgate();
        colgate.clean();
        colgate.shoes();
        colgate.purchase();
        colgate.wash();
        colgate.use();

        System.out.println("--------------------------------");

        WashBasin washBasin=new WashBasin();
        washBasin.Basin(brush);
        washBasin.Basin(colgate);

        System.out.println("--------------------------------");

        Chocolate chocolate=new Chocolate();
        chocolate.eat();
        chocolate.share();
        chocolate.purchase();
        chocolate.wrapper();
        chocolate.flavor();

        System.out.println("--------------------------------");

        Chocolate chocolate1=new DairyMilk();
        chocolate1.eat();
        chocolate1.share();
        chocolate1.purchase();
        chocolate1.wrapper();
        chocolate1.flavor();

        System.out.println("--------------------------------");

        DairyMilk dairyMilk=new DairyMilk();
        dairyMilk.eat();
        dairyMilk.share();
        dairyMilk.purchase();
        dairyMilk.wrapper();
        dairyMilk.flavor();

        System.out.println("--------------------------------");

        Manufacture manufacture=new Manufacture();
        manufacture.item(chocolate);
        manufacture.item(dairyMilk);

        System.out.println("--------------------------------");

        Fish fish=new Fish();
        fish.eat();
        fish.cut();
        fish.purchase();
        fish.type();
        fish.dish();

        System.out.println("--------------------------------");

        Fish fish1=new Salmon();
        fish1.eat();
        fish1.cut();
        fish1.purchase();
        fish1.type();
        fish1.dish();

        System.out.println("--------------------------------");

        Salmon salmon=new Salmon();
        salmon.eat();
        salmon.cut();
        salmon.purchase();
        salmon.type();
        salmon.dish();

        System.out.println("--------------------------------");

        Market market=new Market();
        market.sell(fish);
        market.sell(salmon);

        System.out.println("--------------------------------");

        Board board=new Board();
        board.clean();
        board.write();
        board.read();
        board.color();
        board.chalk();

        System.out.println("--------------------------------");

        Board board1=new Duster();
        board1.clean();
        board1.write();
        board1.read();
        board1.color();
        board1.chalk();

        System.out.println("--------------------------------");

        Duster duster=new Duster();
        duster.clean();
        duster.write();
        duster.read();
        duster.color();
        duster.chalk();

        System.out.println("--------------------------------");

        BlackBoard blackBoard=new BlackBoard();
        blackBoard.write(board);
        blackBoard.write(duster);

        Bag bag=new Bag();
        bag.wear();
        bag.carry();
        bag.wash();
        bag.color();
        bag.buy();

        System.out.println("--------------------------------");

        Bag bag1=new Nike();
        bag1.wear();
        bag1.carry();
        bag1.wash();
        bag1.color();
        bag1.buy();

        System.out.println("--------------------------------");

        Nike nike=new Nike();
        nike.wear();
        nike.carry();
        nike.wash();
        nike.color();
        nike.buy();

        System.out.println("--------------------------------");

        Adidas adidas=new Adidas();
        adidas.wear(bag);
        adidas.wear(nike);

        System.out.println("--------------------------------");

        Ring ring=new Ring();
        ring.wear();
        ring.design();
        ring.wash();
        ring.color();
        ring.buy();

        System.out.println("--------------------------------");

        Ring ring1=new Diamond();
        ring1.wear();
        ring1.design();
        ring1.wash();
        ring1.color();
        ring1.buy();

        System.out.println("--------------------------------");

        Diamond diamond=new Diamond();
        diamond.wear();
        diamond.design();
        diamond.wash();
        diamond.color();
        diamond.buy();

        System.out.println("--------------------------------");

        Jewellery jewellery=new Jewellery();
        jewellery.price(ring);
        jewellery.price(diamond);

        System.out.println("--------------------------------");

        Necklace necklace=new Necklace();
        necklace.wear();
        necklace.design();
        necklace.wash();
        necklace.color();
        necklace.buy();

        System.out.println("--------------------------------");

        Necklace necklace1=new Gold();
        necklace1.wear();
        necklace1.design();
        necklace1.wash();
        necklace1.color();
        necklace1.buy();

        System.out.println("--------------------------------");

        Gold gold=new Gold();
        gold.wear();
        gold.design();
        gold.wash();
        gold.color();
        gold.buy();

        System.out.println("--------------------------------");

        Jewel jewel=new Jewel();
        jewel.purchase(necklace);
        jewel.purchase(gold);

        System.out.println("-------------------------------");

        Gate gate=new Gate();
        gate.type();
        gate.design();
        gate.wash();
        gate.color();
        gate.put();

        System.out.println("--------------------------------");

        Gate gate1=new Steel();
        gate1.type();
        gate1.design();
        gate1.wash();
        gate1.color();
        gate1.put();

        System.out.println("--------------------------------");

        Steel steel=new Steel();
        steel.type();
        steel.design();
        steel.wash();
        steel.color();
        steel.put();

        System.out.println("--------------------------------");

        Build build=new Build();
        build.add(gate);
        build.add(steel);

        System.out.println("--------------------------------");

        Banner banner=new Banner();
        banner.type();
        banner.design();
        banner.display();
        banner.color();
        banner.put();

        System.out.println("--------------------------------");

        Banner banner1=new Mesh();
        banner1.type();
        banner1.design();
        banner1.display();
        banner1.color();
        banner1.put();

        System.out.println("--------------------------------");

        Mesh mesh=new Mesh();
        mesh.type();
        mesh.design();
        mesh.display();
        mesh.color();
        mesh.put();

        System.out.println("--------------------------------");

        Rubber rubber=new Rubber();
        rubber.type();
        rubber.design();
        rubber.use();
        rubber.color();
        rubber.clean();

        System.out.println("--------------------------------");

        Rubber rubber1=new Synthetic();
        rubber1.type();
        rubber1.design();
        rubber1.use();
        rubber1.color();
        rubber1.clean();

        System.out.println("--------------------------------");

        Synthetic synthetic=new Synthetic();
        synthetic.type();
        synthetic.design();
        synthetic.use();
        synthetic.color();
        synthetic.clean();

        System.out.println("--------------------------------");

        WritingPad writingPad=new WritingPad();
        writingPad.type();
        writingPad.design();
        writingPad.use();
        writingPad.color();
        writingPad.clean();

        System.out.println("--------------------------------");

        WritingPad writingPad1=new Notepad();
        writingPad1.type();
        writingPad1.design();
        writingPad1.use();
        writingPad1.color();
        writingPad1.clean();

        System.out.println("--------------------------------");

        Notepad notepad=new Notepad();
        notepad.type();
        notepad.design();
        notepad.use();
        notepad.color();
        notepad.clean();

        System.out.println("--------------------------------");

        ClipBoard clipBoard=new ClipBoard();
        clipBoard.clip(writingPad);
        clipBoard.clip(notepad);

        System.out.println("--------------------------------");

        Projector projector=new Projector();
        projector.type();
        projector.design();
        projector.use();
        projector.color();
        projector.clean();

        System.out.println("--------------------------------");

        Projector projector1=new DLP();
        projector1.type();
        projector1.design();
        projector1.use();
        projector1.color();
        projector1.clean();

        System.out.println("--------------------------------");

        DLP dlp=new DLP();
        dlp.type();
        dlp.design();
        dlp.use();
        dlp.color();
        dlp.clean();

        System.out.println("--------------------------------");

        Screen screen=new Screen();
        screen.cast(projector);
        screen.cast(dlp);

        System.out.println("--------------------------------");

        Textbook textbook=new Textbook();
        textbook.type();
        textbook.design();
        textbook.read();
        textbook.color();
        textbook.write();

        System.out.println("--------------------------------");

        Textbook textbook1=new Author();
        textbook1.type();
        textbook1.design();
        textbook1.read();
        textbook1.color();
        textbook1.write();

        System.out.println("--------------------------------");

        Author author=new Author();
        author.type();
        author.design();
        author.read();
        author.color();
        author.write();

        System.out.println("--------------------------------");

        Writer writer=new Writer();
        writer.story(textbook);
        writer.story(author);

        System.out.println("--------------------------------");

        Hair hair=new Hair();
        hair.type();
        hair.curl();
        hair.straight();
        hair.color();
        hair.style();

        System.out.println("--------------------------------");

        Hair hair1=new Wig();
        hair1.type();
        hair1.curl();
        hair1.straight();
        hair1.color();
        hair1.style();

        System.out.println("--------------------------------");

        Wig wig=new Wig();
        wig.type();
        wig.curl();
        wig.straight();
        wig.color();
        wig.style();

        System.out.println("--------------------------------");

        HairStyle hairStyle=new HairStyle();
        hairStyle.style(hair);
        hairStyle.style(wig);

        System.out.println("--------------------------------");

        Watch watch=new Watch();
        watch.type();
        watch.battery();
        watch.show();
        watch.color();
        watch.wear();

        System.out.println("--------------------------------");

        Watch watch1=new Rolex();
        watch1.type();
        watch1.battery();
        watch1.show();
        watch1.color();
        watch1.wear();

        System.out.println("--------------------------------");

        Rolex rolex=new Rolex();
        rolex.type();
        rolex.battery();
        rolex.show();
        rolex.color();
        rolex.wear();

        System.out.println("--------------------------------");

        Luxury luxury=new Luxury();
        luxury.buy(watch);
        luxury.buy(rolex);

        System.out.println("--------------------------------");

        Bracelet bracelet=new Bracelet();
        bracelet.type();
        bracelet.design();
        bracelet.show();
        bracelet.color();
        bracelet.wear();

        System.out.println("--------------------------------");

        Bracelet bracelet1=new Cartier();
        bracelet1.type();
        bracelet1.design();
        bracelet1.show();
        bracelet1.color();
        bracelet1.wear();

        System.out.println("--------------------------------");

        Cartier cartier=new Cartier();
        cartier.type();
        cartier.design();
        cartier.show();
        cartier.color();
        cartier.wear();

        System.out.println("--------------------------------");

        Gift gift=new Gift();
        gift.give(bracelet);
        gift.give(cartier);

        Colddrink colddrink=new Colddrink();
        colddrink.type();
        colddrink.design();
        colddrink.show();
        colddrink.color();
        colddrink.drink();

        System.out.println("--------------------------------");

        Colddrink colddrink1=new CocaCola();
        colddrink1.type();
        colddrink1.design();
        colddrink1.show();
        colddrink1.color();
        colddrink1.drink();

        System.out.println("--------------------------------");

        CocaCola cocaCola=new CocaCola();
        cocaCola.type();
        cocaCola.design();
        cocaCola.show();
        cocaCola.color();
        cocaCola.drink();

        System.out.println("--------------------------------");

        Sponsor sponsor=new Sponsor();
        sponsor.sell(colddrink);
        sponsor.sell(cocaCola);

        System.out.println("--------------------------------");

        Headphone headphone=new Headphone();
        headphone.type();
        headphone.design();
        headphone.show();
        headphone.color();
        headphone.use();

        System.out.println("--------------------------------");

        Headphone headphone1=new Bose();
        headphone1.type();
        headphone1.design();
        headphone1.show();
        headphone1.color();
        headphone1.use();

        System.out.println("--------------------------------");

        Bose bose=new Bose();
        bose.type();
        bose.design();
        bose.show();
        bose.color();
        bose.use();

        System.out.println("--------------------------------");

        Quality quality=new Quality();
        quality.goodQuality(headphone);
        quality.goodQuality(bose);

        System.out.println("-------------------------------");

        Tshirt tshirt=new Tshirt();
        tshirt.type();
        tshirt.design();
        tshirt.show();
        tshirt.color();
        tshirt.use();

        System.out.println("--------------------------------");

        Tshirt tshirt1=new Casual();
        tshirt1.type();
        tshirt1.design();
        tshirt1.show();
        tshirt1.color();
        tshirt1.use();

        System.out.println("--------------------------------");

        Casual casual=new Casual();
        casual.type();
        casual.design();
        casual.show();
        casual.color();
        casual.use();

        System.out.println("--------------------------------");

        Wear wear=new Wear();
        wear.out(tshirt);
        wear.out(casual);

        Panipuri panipuri=new Panipuri();
        panipuri.type();
        panipuri.eat();
        panipuri.taste();
        panipuri.color();
        panipuri.flavor();

        System.out.println("--------------------------------");

        Panipuri panipuri1=new Chaat();
        panipuri1.type();
        panipuri1.eat();
        panipuri1.taste();
        panipuri1.color();
        panipuri1.flavor();

        System.out.println("--------------------------------");

        Chaat chaat=new Chaat();
        chaat.type();
        chaat.eat();
        chaat.taste();
        chaat.color();
        chaat.flavor();

        System.out.println("--------------------------------");

        Sukapuri sukapuri=new Sukapuri();
        sukapuri.drink(panipuri);
        sukapuri.drink(chaat);

        System.out.println("---------------------------------");

        MilkShake milkShake=new MilkShake();
        milkShake.type();
        milkShake.drink();
        milkShake.taste();
        milkShake.color();
        milkShake.flavor();

        System.out.println("--------------------------------");

        MilkShake milkShake1=new MilkShake();
        milkShake1.type();
        milkShake1.drink();
        milkShake1.taste();
        milkShake1.color();
        milkShake1.flavor();

        System.out.println("--------------------------------");

        KitKat kitKat=new KitKat();
        kitKat.type();
        kitKat.drink();
        kitKat.taste();
        kitKat.color();
        kitKat.flavor();

        System.out.println("--------------------------------");

        Cold cold=new Cold();
        cold.straw(milkShake);
        cold.straw(kitKat);

        System.out.println("--------------------------------");

        Sea sea=new Sea();
        sea.type();
        sea.run();
        sea.swim();
        sea.tree();
        sea.weather();

        System.out.println("--------------------------------");

        Sea sea1=new Arabian();
        sea1.type();
        sea1.run();
        sea1.swim();
        sea1.tree();
        sea1.weather();

        System.out.println("--------------------------------");

        Arabian arabian=new Arabian();
        arabian.type();
        arabian.run();
        arabian.swim();
        arabian.tree();
        arabian.weather();

        System.out.println("--------------------------------");

        Dive dive=new Dive();
        dive.scuba(sea);
        dive.scuba(arabian);

        System.out.println("--------------------------------");

        Beach beach=new Beach();
        beach.type();
        beach.run();
        beach.swim();
        beach.tree();
        beach.weather();

        System.out.println("--------------------------------");

        Beach beach1=new Island();
        beach1.type();
        beach1.run();
        beach1.swim();
        beach1.tree();
        beach1.weather();

        System.out.println("--------------------------------");

        Island island=new Island();
        island.type();
        island.run();
        island.swim();
        island.tree();
        island.weather();

        System.out.println("--------------------------------");

        Sand sand=new Sand();
        sand.mud(beach);
        sand.mud(island);

        System.out.println("-------------------------------");

        Country country=new Country();
        country.type();
        country.flag();
        country.travel();
        country.trees();
        country.population();

        System.out.println("--------------------------------");

        Country country1=new India();
        country1.type();
        country1.flag();
        country1.travel();
        country1.trees();
        country1.population();

        System.out.println("--------------------------------");

        India india=new India();
        india.type();
        india.flag();
        india.travel();
        india.trees();
        india.population();

        System.out.println("--------------------------------");

        Travel travel=new Travel();
        travel.Roam(country);
        travel.Roam(india);

        System.out.println("--------------------------------");

        City city=new City();
        city.type();
        city.shop();
        city.travel();
        city.trees();
        city.population();

        System.out.println("--------------------------------");

        City city1=new Bangalore();
        city1.type();
        city1.shop();
        city1.travel();
        city1.trees();
        city1.population();

        System.out.println("--------------------------------");

        Bangalore bangalore=new Bangalore();
        bangalore.type();
        bangalore.shop();
        bangalore.travel();
        bangalore.trees();
        bangalore.population();

        System.out.println("--------------------------------");

        BashyamCircle bashyamCircle=new BashyamCircle();
        bashyamCircle.Xworkz(city);
        bashyamCircle.Xworkz(bangalore);

        System.out.println("---------------------------------");

        Shop shop=new Shop();
        shop.type();
        shop.location();
        shop.place();
        shop.things();
        shop.visit();

        System.out.println("--------------------------------");

        Shop shop1=new Ration();
        shop1.type();
        shop1.location();
        shop1.place();
        shop1.things();
        shop1.visit();

        System.out.println("--------------------------------");

        Ration ration=new Ration();
        ration.type();
        ration.location();
        ration.place();
        ration.things();
        ration.visit();

        System.out.println("--------------------------------");

        ShopKeeper shopKeeper=new ShopKeeper();
        shopKeeper.sell(shop);
        shopKeeper.sell(ration);

        System.out.println("--------------------------------");

        Bakery bakery=new Bakery();
        bakery.type();
        bakery.location();
        bakery.place();
        bakery.sweets();
        bakery.visit();

        System.out.println("--------------------------------");

        Bakery bakery1=new Jalebi();
        bakery1.type();
        bakery1.location();
        bakery1.place();
        bakery1.sweets();
        bakery1.visit();

        System.out.println("--------------------------------");

        Jalebi jalebi=new Jalebi();
        jalebi.type();
        jalebi.location();
        jalebi.place();
        jalebi.sweets();
        jalebi.visit();

        System.out.println("--------------------------------");

        Sweets sweets=new Sweets();
        sweets.eat(bakery);
        sweets.eat(bakery);

        System.out.println("--------------------------------");

        Center center=new Center();
        center.type();
        center.location();
        center.place();
        center.books();
        center.visit();

        System.out.println("--------------------------------");

        Center center1=new Training();
        center1.type();
        center1.location();
        center1.place();
        center1.books();
        center1.visit();

        System.out.println("--------------------------------");

        Training training=new Training();
        training.type();
        training.location();
        training.place();
        training.books();
        training.visit();

        System.out.println("--------------------------------");

        Certificate certificate=new Certificate();
        certificate.report(center);
        certificate.report(training);

        Gym gym=new Gym();
        gym.type();
        gym.location();
        gym.place();
        gym.dumbbells();
        gym.visit();

        System.out.println("--------------------------------");

        Gym gym1=new WorkOut();
        gym1.type();
        gym1.location();
        gym1.place();
        gym1.dumbbells();
        gym1.visit();

        System.out.println("--------------------------------");

        WorkOut workOut=new WorkOut();
        workOut.type();
        workOut.location();
        workOut.place();
        workOut.dumbbells();
        workOut.visit();

        System.out.println("--------------------------------");

        Place place=new Place();
        place.exercise(gym);
        place.exercise(workOut);

        System.out.println("--------------------------------");

        PowerBank powerBank=new PowerBank();
        powerBank.type();
        powerBank.charge();
        powerBank.recharge();
        powerBank.wire();
        powerBank.connect();

        System.out.println("--------------------------------");

        PowerBank powerBank1=new PowerBank();
        powerBank1.type();
        powerBank1.charge();
        powerBank1.recharge();
        powerBank1.wire();
        powerBank1.connect();

        System.out.println("--------------------------------");

        Anker anker=new Anker();
        anker.type();
        anker.charge();
        anker.recharge();
        anker.wire();
        anker.connect();

        System.out.println("--------------------------------");

        Battery battery=new Battery();
        battery.charge(powerBank);
        battery.charge(anker);

        System.out.println("--------------------------------");

        Lipstick lipstick=new Lipstick();
        lipstick.type();
        lipstick.duration();
        lipstick.brand();
        lipstick.color();
        lipstick.quality();

        System.out.println("--------------------------------");

        Lipstick lipstick1=new Dior();
        lipstick1.type();
        lipstick1.duration();
        lipstick1.brand();
        lipstick1.color();
        lipstick1.quality();

        System.out.println("--------------------------------");

        Dior dior=new Dior();
        dior.type();
        dior.duration();
        dior.brand();
        dior.color();
        dior.quality();

        System.out.println("--------------------------------");

        Shade shade=new Shade();
        shade.match(lipstick);
        shade.match(dior);

        System.out.println("--------------------------------");

        Specks specks=new Specks();
        specks.type();
        specks.duration();
        specks.lens();
        specks.color();
        specks.quality();

        System.out.println("--------------------------------");

        Specks specks1=new LensKart();
        specks1.type();
        specks1.duration();
        specks1.lens();
        specks1.color();
        specks1.quality();

        System.out.println("--------------------------------");

        LensKart lensKart=new LensKart();
        lensKart.type();
        lensKart.duration();
        lensKart.lens();
        lensKart.color();
        lensKart.quality();

        System.out.println("--------------------------------");

        Showroom showroom=new Showroom();
        showroom.show(specks);
        showroom.show(lensKart);

        System.out.println("--------------------------------");

        Clock clock=new Clock();
        clock.type();
        clock.duration();
        clock.lens();
        clock.color();
        clock.quality();

        System.out.println("--------------------------------");

        Clock clock1=new Casio();
        clock1.type();
        clock1.duration();
        clock1.lens();
        clock1.color();
        clock1.quality();

        System.out.println("--------------------------------");

        Casio casio=new Casio();
        casio.type();
        casio.duration();
        casio.lens();
        casio.color();
        casio.quality();

        System.out.println("--------------------------------");

        Time time=new Time();
        time.look(clock);
        time.look(casio);

        College college=new College();
        college.construction();
        college.library();
        college.lecturers();
        college.students();
        college.rating();

        System.out.println("--------------------------------");

        College college1=new Campus();
        college1.construction();
        college1.library();
        college1.lecturers();
        college1.students();
        college1.rating();

        System.out.println("--------------------------------");

        Campus campus=new Campus();
        campus.construction();
        campus.library();
        campus.lecturers();
        campus.students();
        campus.rating();

        System.out.println("--------------------------------");

        Attendance attendance=new Attendance();
        attendance.compulsory(college);
        attendance.compulsory(campus);

        System.out.println("--------------------------------");

        Temple temple=new Temple();
        temple.construction();
        temple.people();
        temple.statue();
        temple.type();
        temple.rating();

        System.out.println("--------------------------------");

        Temple temple1=new Iskcon();
        temple1.construction();
        temple1.people();
        temple1.statue();
        temple1.type();
        temple1.rating();

        System.out.println("--------------------------------");

        Iskcon iskcon=new Iskcon();
        iskcon.construction();
        iskcon.people();
        iskcon.statue();
        iskcon.type();
        iskcon.rating();

        System.out.println("--------------------------------");

        Prayer prayer=new Prayer();
        prayer.bell(temple);
        prayer.bell(iskcon);

        System.out.println("--------------------------------");

        History history=new History();
        history.book();
        history.people();
        history.statue();
        history.type();
        history.rating();

        System.out.println("--------------------------------");

        History history1=new Story();
        history1.book();
        history1.people();
        history1.statue();
        history1.type();
        history1.rating();

        System.out.println("--------------------------------");

        Story story=new Story();
        story.book();
        story.people();
        story.statue();
        story.type();
        story.rating();

        System.out.println("--------------------------------");

        Fighters fighters=new Fighters();
        fighters.fights(history);
        fighters.fights(story);

        System.out.println("--------------------------------");

        Photographer photographer=new Photographer();
        photographer.click();
        photographer.passion();
        photographer.followers();
        photographer.type();
        photographer.rating();

        System.out.println("--------------------------------");

        Photographer photographer1=new Photos();
        photographer1.click();
        photographer1.passion();
        photographer1.followers();
        photographer1.type();
        photographer1.rating();

        System.out.println("--------------------------------");

        Photos photos=new Photos();
        photos.click();
        photos.passion();
        photos.followers();
        photos.type();
        photos.rating();

        System.out.println("--------------------------------");

        Frame frame=new Frame();
        frame.snap(photographer);
        frame.snap(photos);

        System.out.println("--------------------------------");

        Court court=new Court();
        court.judge();
        court.rules();
        court.law();
        court.type();
        court.rating();

        System.out.println("--------------------------------");

        Court court1=new Lawyer();
        court1.judge();
        court1.rules();
        court1.law();
        court1.type();
        court1.rating();

        System.out.println("--------------------------------");

        Lawyer lawyer=new Lawyer();
        lawyer.judge();
        lawyer.rules();
        lawyer.law();
        lawyer.type();
        lawyer.rating();

        System.out.println("--------------------------------");

        HighCourt highCourt=new HighCourt();
        highCourt.judgement(court);
        highCourt.judgement(lawyer);

        System.out.println("--------------------------------");

        Athlete athlete=new Athlete();
        athlete.run();
        athlete.rules();
        athlete.fit();
        athlete.type();
        athlete.workout();

        System.out.println("--------------------------------");

        Athlete athlete1=new Sports();
        athlete1.run();
        athlete1.rules();
        athlete1.fit();
        athlete1.type();
        athlete1.workout();

        System.out.println("--------------------------------");

        Sports sports=new Sports();
        sports.run();
        sports.rules();
        sports.fit();
        sports.type();
        sports.workout();

        System.out.println("--------------------------------");

        Player player=new Player();
        player.play(athlete);
        player.play(sports);

        System.out.println("--------------------------------");

        Police police=new Police();
        police.law();
        police.rules();
        police.strong();
        police.type();
        police.respect();

        System.out.println("--------------------------------");

        Police police1=new Crime();
        police1.law();
        police1.rules();
        police1.strong();
        police1.type();
        police1.respect();

        System.out.println("--------------------------------");

        Crime crime=new Crime();
        crime.law();
        crime.rules();
        crime.strong();
        crime.type();
        crime.respect();

        System.out.println("---------------------------------");

        Legal legal=new Legal();
        legal.jail(police);
        legal.jail(crime);

        System.out.println("--------------------------------");

        Pencil pencil=new Pencil();
        pencil.design();
        pencil.use();
        pencil.sharp();
        pencil.type();
        pencil.color();

        System.out.println("--------------------------------");

        Pencil pencil1=new Doms();
        pencil1.design();
        pencil1.use();
        pencil1.sharp();
        pencil1.type();
        pencil1.color();

        System.out.println("--------------------------------");

        Doms doms=new Doms();
        doms.design();
        doms.use();
        doms.sharp();
        doms.type();
        doms.color();

        System.out.println("---------------------------------");

        Pen pen=new Pen();
        pen.length(pencil);
        pen.length(doms);
    }
}
