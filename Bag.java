class Bag{
	char size;
	String Brand;
	String color;
	int price;
	
	public Bag(){
		System.out.println("Bag is good to carry stuffs");
	}
	public static void main(String[] values){
		Bag bag1=new Bag();
		bag1.size='M';
		bag1.Brand="JanSport";
		bag1.color="Yellow";
		bag1.price=300;
		System.out.println("Size:"+bag1.size+", Brand:"+bag1.Brand+", Color:"+bag1.color+", Bagprice:"+bag1.price);
		
		Bag bag2=new Bag();
		bag2.size='S';
		bag2.Brand="Herschel";
		bag2.color="Brown";
		bag2.price=500;
		System.out.println("Size:"+bag2.size+", Brand:"+bag2.Brand+", Color:"+bag2.color+", Bagprice:"+bag2.price);
		
		Bag bag3=new Bag();
		bag3.size='S';
		bag3.Brand="Nike";
		bag3.color="Blue";
		bag3.price=400;
		System.out.println("Size:"+bag3.size+", Brand:"+bag3.Brand+", Color:"+bag3.color+", Bagprice:"+bag3.price);
		
		Bag bag4=new Bag();
		bag4.size='M';
		bag4.Brand="Adidas";
		bag4.color="Orange";
		bag4.price=1000;
		System.out.println("Size:"+bag4.size+", Brand:"+bag4.Brand+", Color:"+bag4.color+", Bagprice:"+bag4.price);
		
		Bag bag5=new Bag();
		bag5.size='X';
		bag5.Brand="Eastpak";
		bag5.color="Red";
		bag5.price=600;
		System.out.println("Size:"+bag5.size+", Brand:"+bag5.Brand+", Color:"+bag5.color+", Bagprice:"+bag5.price);
		
		Bag bag6=new Bag();
		bag6.size='L';
		bag6.Brand="Fjällräven";
		bag6.color="Green";
		bag6.price=700;
		System.out.println("Size:"+bag6.size+", Brand:"+bag6.Brand+", Color:"+bag6.color+", Bagprice:"+bag6.price);
		
		Bag bag7=new Bag();
		bag7.size='L';
		bag7.Brand="Under Armour";
		bag7.color="Purple";
		bag7.price=800;
		System.out.println("Size:"+bag7.size+", Brand:"+bag7.Brand+", Color:"+bag7.color+", Bagprice:"+bag7.price);
		
		Bag bag8=new Bag();
		bag8.size='M';
		bag8.Brand="L.L.Bean";
		bag8.color="Pink";
		bag8.price=900;
		System.out.println("Size:"+bag8.size+", Brand:"+bag8.Brand+", Color:"+bag8.color+", Bagprice:"+bag8.price);
		
		Bag bag9=new Bag();
		bag9.size='S';
		bag9.Brand="Vans";
		bag9.color="White";
		bag9.price=500;
		System.out.println("Size:"+bag9.size+", Brand:"+bag9.Brand+", Color:"+bag9.color+", Bagprice:"+bag9.price);
		
		Bag bag10=new Bag();
		bag10.size='L';
		bag10.Brand="The North Face";
		bag10.color="Purple";
		bag10.price=600;
		System.out.println("Size:"+bag10.size+". Brand:"+bag10.Brand+", Color:"+bag10.color+", Bagprice:"+bag10.price);
	}
}