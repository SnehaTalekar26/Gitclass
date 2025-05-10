class Chocolate{
	String name;
	int price;
	boolean isVegan;
	int noOfbars;
	
	public Chocolate(){
		System.out.println("Chocolate is used to eat");
	}
	public static void main(String[] values){
		Chocolate chocolate1=new Chocolate();
		chocolate1.name="Dairy Milk";
		chocolate1.price=20;
		chocolate1.isVegan=true;
		chocolate1.noOfbars=8;
		System.out.println("name:"+chocolate1.name+", price:"+chocolate1.price+", isVegan:"+chocolate1.isVegan+", ChocolatenoOfbars:"+chocolate1.noOfbars);
		
		Chocolate chocolate2=new Chocolate();
		chocolate2.name="Perk";
		chocolate2.price=10;
		chocolate2.isVegan=false;
		chocolate2.noOfbars=1;
		System.out.println("name:"+chocolate2.name+", price:"+chocolate2.price+", isVegan:"+chocolate2.isVegan+", ChocolatenoOfbars:"+chocolate2.noOfbars);
		
		Chocolate chocolate3=new Chocolate();
		chocolate3.name="Munch";
		chocolate3.price=20;
		chocolate3.isVegan=true;
		chocolate3.noOfbars=0;
		System.out.println("name:"+chocolate3.name+", price:"+chocolate3.price+", isVegan:"+chocolate3.isVegan+", ChocolatenoOfbars:"+chocolate3.noOfbars);
		
		Chocolate chocolate4=new Chocolate();
		chocolate4.name="5 Star";
		chocolate4.price=10;
		chocolate4.isVegan=false;
		chocolate4.noOfbars=0;
		System.out.println("name:"+chocolate4.name+", price:"+chocolate4.price+", isVegan:"+chocolate4.isVegan+", ChocolatenoOfbars:"+chocolate4.noOfbars);
		
		Chocolate chocolate5=new Chocolate();
		chocolate5.name="KitKat";
		chocolate5.price=30;
		chocolate5.isVegan=false;
		chocolate5.noOfbars=2;
		System.out.println("name:"+chocolate5.name+", price:"+chocolate5.price+", isVegan:"+chocolate5.isVegan+", ChocolatenoOfbars:"+chocolate5.noOfbars);
		
		Chocolate chocolate6=new Chocolate();
		chocolate6.name="Milka";
		chocolate6.price=160;
		chocolate6.isVegan=true;
		chocolate6.noOfbars=6;
		System.out.println("name:"+chocolate6.name+", price:"+chocolate6.price+", isVegan:"+chocolate6.isVegan+", ChocolatenoOfbars:"+chocolate6.noOfbars);
		
		Chocolate chocolate7=new Chocolate();
		chocolate7.name="Lindt Chocolate";
		chocolate7.price=250;
		chocolate7.isVegan=false;
		chocolate7.noOfbars=10;
		System.out.println("name:"+chocolate7.name+", price:"+chocolate7.price+", isVegan:"+chocolate7.isVegan+", ChocolatenoOfbars:"+chocolate7.noOfbars);
		
		Chocolate chocolate8=new Chocolate();
		chocolate8.name="Chomp";
		chocolate8.price=30;
		chocolate8.isVegan=true;
		chocolate8.noOfbars=10;
		System.out.println("name:"+chocolate8.name+", price:"+chocolate8.price+", isVegan:"+chocolate8.isVegan+", ChocolatenoOfbars:"+chocolate8.noOfbars);
		
		Chocolate chocolate9=new Chocolate();
		chocolate9.name="Toblerone";
		chocolate9.price=150;
		chocolate9.isVegan=true;
		chocolate9.noOfbars=6;
		System.out.println("name:"+chocolate9.name+", price:"+chocolate9.price+", isVegan:"+chocolate9.isVegan+", ChocolatenoOfbars:"+chocolate9.noOfbars);
		
		Chocolate chocolate10=new Chocolate();
		chocolate10.name="Hershey's";
		chocolate10.price=50;
		chocolate10.isVegan=true;
		chocolate10.noOfbars=8;
		System.out.println("name:"+chocolate10.name+". price:"+chocolate10.price+", isVegan:"+chocolate10.isVegan+", ChocolatenoOfbars:"+chocolate10.noOfbars);
	}
}