class TheMainRunner{
	public static void main(String[] values){
		Festival festival1 = new Festival("Diwali", "2025-11-12", 3);
		System.out.println("Name:"+festival1.name+", Date:"+festival1.date+", Duration:"+festival1.duration);
        Festival festival2 = new Festival("Christmas", "2025-12-25", 1);
		System.out.println("Name:"+festival2.name+", Date:"+festival2.date+", Duration:"+festival2.duration);
        Festival festival3 = new Festival("New Year", "2026-01-01", 1);
		System.out.println("Name:"+festival3.name+", Date:"+festival3.date+", Duration:"+festival3.duration);
        Festival festival4 = new Festival("Holi", "2025-03-12", 1);
		System.out.println("Name:"+festival4.name+", Date:"+festival4.date+", Duration:"+festival4.duration);
        Festival festival5 = new Festival("Eid", "2025-05-01", 1);
		System.out.println("Name:"+festival5.name+", Date:"+festival5.date+", Duration:"+festival5.duration);
		System.out.println("--------------------------------------------------");
		
		Chat chat1 = new Chat("Hi", "Sneha", 1);
		System.out.println("Message:"+chat1.message+", DateUserName:"+chat1.username+", NoOfText:"+chat1.noOfText);
        Chat chat2 = new Chat("Hello", "Ananya", 1);
		System.out.println("Message:"+chat2.message+", DateUserName:"+chat2.username+", NoOfText:"+chat2.noOfText);
        Chat chat3 = new Chat("How are you?", "Raksha", 3);
		System.out.println("Message:"+chat3.message+", DateUserName:"+chat3.username+", NoOfText:"+chat3.noOfText);
        Chat chat4 = new Chat("Shall we leave?", "Sarthak", 3);
		System.out.println("Message:"+chat4.message+", DateUserName:"+chat4.username+", NoOfText:"+chat4.noOfText);
        Chat chat5 = new Chat("Lets go", "Shruti", 2);
		System.out.println("Message:"+chat5.message+", DateUserName:"+chat5.username+", NoOfText:"+chat5.noOfText);
		System.out.println("--------------------------------------------------");
		
		Charger charger1 = new Charger("USB-A Charger", true, 30);
		System.out.println("Type:"+charger1.type+", IsCharging:"+charger1.isCharging+", Power:"+charger1.power);
        Charger charger2 = new Charger("USB-C Charger", false, 100);                   
		System.out.println("Type:"+charger2.type+", IsCharging:"+charger2.isCharging+", Power:"+charger2.power);
        Charger charger3 = new Charger("USB-A Charger", false, 60);                    
		System.out.println("Type:"+charger3.type+", IsCharging:"+charger3.isCharging+", Power:"+charger3.power);
        Charger charger4 = new Charger("Micro-USB Charger", true, 10);                        
		System.out.println("Type:"+charger4.type+", IsCharging:"+charger4.isCharging+", Power:"+charger4.power);
        Charger charger5 = new Charger("Wireless Charger", false, 70);                         
		System.out.println("Type:"+charger5.type+", IsCharging:"+charger5.isCharging+", Power:"+charger5.power);
		System.out.println("--------------------------------------------------");
		
		Harpic harpic1 = new Harpic("Harpic Power Plus", true, 30.3);
		System.out.println("ProductName:"+harpic1.productname+", isEcoFriendly:"+harpic1.isEcofriendly+", Price:"+harpic1.price);
        Harpic harpic2 = new Harpic("Harpic Fresh Power", true, 100.0);                   
		System.out.println("ProductName:"+harpic2.productname+", isEcoFriendly:"+harpic2.isEcofriendly+", Price:"+harpic2.price);
        Harpic harpic3 = new Harpic("Harpic Toilet Cleaner", false, 120.2);                    
		System.out.println("ProductName:"+harpic3.productname+", isEcoFriendly:"+harpic3.isEcofriendly+", Price:"+harpic3.price);
        Harpic harpic4 = new Harpic("Harpic Bathroom Cleaner", false, 61.0);                        
		System.out.println("ProductName:"+harpic4.productname+", isEcoFriendly:"+harpic4.isEcofriendly+", Price:"+harpic4.price);
        Harpic harpic5 = new Harpic("Harpic 10X Cleaning Power", true, 70.4);                         
		System.out.println("ProductName:"+harpic5.productname+", isEcoFriendly:"+harpic5.isEcofriendly+", Price:"+harpic5.price);
		System.out.println("--------------------------------------------------");
		
		Whatsapp whatsapp1 = new Whatsapp("Sneha", true, 3);
		System.out.println("Sender:"+whatsapp1.sender+", IsRead:"+whatsapp1.isRead+", Texts:"+whatsapp1.texts);
        Whatsapp whatsapp2 = new Whatsapp("Ananya", false, 1);                   
		System.out.println("Sender:"+whatsapp2.sender+", IsRead:"+whatsapp2.isRead+", Texts:"+whatsapp2.texts);
        Whatsapp whatsapp3 = new Whatsapp("Raksha", true, 2);                    
		System.out.println("Sender:"+whatsapp3.sender+", IsRead:"+whatsapp3.isRead+", Texts:"+whatsapp3.texts);
        Whatsapp whatsapp4 = new Whatsapp("Sarthak", true, 4);                        
		System.out.println("Sender:"+whatsapp4.sender+", IsRead:"+whatsapp4.isRead+", Texts:"+whatsapp4.texts);
        Whatsapp whatsapp5 = new Whatsapp("Shruti", false, 2);                         
		System.out.println("Sender:"+whatsapp5.sender+", IsRead:"+whatsapp5.isRead+", Texts:"+whatsapp5.texts);
		System.out.println("--------------------------------------------------");
		
		RatPoison ratpoison1 = new RatPoison("RatX Ultra", 95.5, 3);
		System.out.println("PoisonName:"+ratpoison1.poisonname+", ToxicityLevel:"+ratpoison1.toxicitylevel+", Weight:"+ratpoison1.weight);
        RatPoison ratpoison2 = new RatPoison("Tomcat Rodenticide", 60.0, 1);                   
		System.out.println("PoisonName:"+ratpoison2.poisonname+", ToxicityLevel:"+ratpoison2.toxicitylevel+", Weight:"+ratpoison2.weight);
        RatPoison ratpoison3 = new RatPoison("D-Con Rat Poison", 50.5, 1);                    
		System.out.println("PoisonName:"+ratpoison3.poisonname+", ToxicityLevel:"+ratpoison3.toxicitylevel+", Weight:"+ratpoison3.weight);
        RatPoison ratpoison4 = new RatPoison("Combat Roach and Ant Killer", 20.5, 1);                        
		System.out.println("PoisonName:"+ratpoison4.poisonname+", ToxicityLevel:"+ratpoison4.toxicitylevel+", Weight:"+ratpoison4.weight);
        RatPoison ratpoison5 = new RatPoison("Raider Rat Poison", 90.5, 1);                         
		System.out.println("PoisonName:"+ratpoison5.poisonname+", ToxicityLevel:"+ratpoison5.toxicitylevel+", Weight:"+ratpoison5.weight);
		System.out.println("--------------------------------------------------");
		
		Anklet anklet1 = new Anklet("Gray", 950.5, 6);
		System.out.println("Color:"+anklet1.color+", AnkletPrice:"+anklet1.ankletprice+", Size:"+anklet1.size);
        Anklet anklet2 = new Anklet("Silver", 600.0, 5);                   
		System.out.println("Color:"+anklet2.color+", AnkletPrice:"+anklet2.ankletprice+", Size:"+anklet2.size);
        Anklet anklet3 = new Anklet("Gold", 500.5, 7);                    
		System.out.println("Color:"+anklet3.color+", AnkletPrice:"+anklet3.ankletprice+", Size:"+anklet3.size);
        Anklet anklet4 = new Anklet("White", 200.5, 8);                        
		System.out.println("Color:"+anklet4.color+", AnkletPrice:"+anklet4.ankletprice+", Size:"+anklet4.size);
        Anklet anklet5 = new Anklet("RoseGold", 700.5, 7);                        
		System.out.println("Color:"+anklet5.color+", AnkletPrice:"+anklet5.ankletprice+", Size:"+anklet5.size);
		System.out.println("--------------------------------------------------");
		
		Magnet magnet1 = new Magnet("Neodymium Magnet", 52.5, 6);
		System.out.println("MagnetType:"+magnet1.magnetType+", MagnetStrength:"+magnet1.magnetStrength+", MagnetSize:"+magnet1.magnetSize);
        Magnet magnet2 = new Magnet("Samarium-Cobalt Magnet", 30.0, 5);                   
		System.out.println("MagnetType:"+magnet2.magnetType+", MagnetStrength:"+magnet2.magnetStrength+", MagnetSize:"+magnet2.magnetSize);
        Magnet magnet3 = new Magnet("Alnico Magnet", 10.5, 7);                    
		System.out.println("MagnetType:"+magnet3.magnetType+", MagnetStrength:"+magnet3.magnetStrength+", MagnetSize:"+magnet3.magnetSize);
        Magnet magnet4 = new Magnet("Ceramic Magnet", 20.5, 8);                        
		System.out.println("MagnetType:"+magnet4.magnetType+", MagnetStrength:"+magnet4.magnetStrength+", MagnetSize:"+magnet4.magnetSize);
        Magnet magnet5 = new Magnet("Flexible Magnet", 7.5, 7);                        
		System.out.println("MagnetType:"+magnet5.magnetType+", MagnetStrength:"+magnet5.magnetStrength+", MagnetSize:"+magnet5.magnetSize);
		System.out.println("--------------------------------------------------");
		
		Chain chain1 = new Chain("Steel", 52.5, 6);
		System.out.println("Material:"+chain1.material+", Length:"+chain1.length+", ChainWeight:"+chain1.chainweight);
        Chain chain2 = new Chain("Titanium", 30.0, 5);                   
		System.out.println("Material:"+chain2.material+", Length:"+chain2.length+", ChainWeight:"+chain2.chainweight);
        Chain chain3 = new Chain("Iron", 10.5, 7);                    
		System.out.println("Material:"+chain3.material+", Length:"+chain3.length+", ChainWeight:"+chain3.chainweight);
        Chain chain4 = new Chain("Copper", 20.5, 8);                        
		System.out.println("Material:"+chain4.material+", Length:"+chain4.length+", ChainWeight:"+chain4.chainweight);
        Chain chain5 = new Chain("Aluminum", 7.5, 7);                        
		System.out.println("Material:"+chain5.material+", Length:"+chain5.length+", ChainWeight:"+chain5.chainweight);
		System.out.println("--------------------------------------------------");
		
		Bar bar1 = new Bar("Steel", 5.5, 150);
		System.out.println("BarMaterial:"+bar1.barmaterial+", BarLength:"+bar1.barlength+", BarWeight:"+bar1.barWeight);
        Bar bar2 = new Bar("Aluminum", 3.2, 50);                   
		System.out.println("BarMaterial:"+bar2.barmaterial+", BarLength:"+bar2.barlength+", BarWeight:"+bar2.barWeight);
        Bar bar3 = new Bar("Wood", 2.0, 30);                    
		System.out.println("BarMaterial:"+bar3.barmaterial+", BarLength:"+bar3.barlength+", BarWeight:"+bar3.barWeight);
        Bar bar4 = new Bar("Copper", 4.0, 70);                        
		System.out.println("BarMaterial:"+bar4.barmaterial+", BarLength:"+bar4.barlength+", BarWeight:"+bar4.barWeight);
        Bar bar5 = new Bar("Titanium", 6.0, 80);                        
		System.out.println("BarMaterial:"+bar5.barmaterial+", BarLength:"+bar5.barlength+", BarWeight:"+bar5.barWeight);
		System.out.println("--------------------------------------------------");
		
		Sneha sneha1 = new Sneha('T', 5.3, 21);
		System.out.println("Initial:"+sneha1.initial+", SnehaHeight:"+sneha1.Snehaheight+", Age:"+sneha1.age);
        Sneha sneha2 = new Sneha('T', 5.3, 21);                   
		System.out.println("Initial:"+sneha2.initial+", SnehaHeight:"+sneha2.Snehaheight+", Age:"+sneha2.age);
        Sneha sneha3 = new Sneha('T', 5.3, 21);                    
		System.out.println("Initial:"+sneha3.initial+", SnehaHeight:"+sneha3.Snehaheight+", Age:"+sneha3.age);
        Sneha sneha4 = new Sneha('T', 5.3, 21);                        
		System.out.println("Initial:"+sneha4.initial+", SnehaHeight:"+sneha4.Snehaheight+", Age:"+sneha4.age);
        Sneha sneha5 = new Sneha('T', 5.3, 21);                        
		System.out.println("Initial:"+sneha5.initial+", SnehaHeight:"+sneha5.Snehaheight+", Age:"+sneha5.age);
		System.out.println("--------------------------------------------------");
		
		Face face1 = new Face("Oval", "Fair", 1.5);
		System.out.println("Shape:"+face1.shape+", FaceColor:"+face1.faceColor+", Width:"+face1.width);
        Face face2 = new Face("Round","Light", 2.0);                   
		System.out.println("Shape:"+face2.shape+", FaceColor:"+face2.faceColor+", Width:"+face2.width);
        Face face3 = new Face("Square", "Medium", 3.0);                    
		System.out.println("Shape:"+face3.shape+", FaceColor:"+face3.faceColor+", Width:"+face3.width);
        Face face4 = new Face("Diamond", "Tan", 1.7);                        
		System.out.println("Shape:"+face4.shape+", FaceColor:"+face4.faceColor+", Width:"+face4.width);
        Face face5 = new Face("Rectangle", "Dark", 2.8);                        
		System.out.println("Shape:"+face5.shape+", FaceColor:"+face5.faceColor+", Width:"+face5.width);
		System.out.println("--------------------------------------------------");
	}
}