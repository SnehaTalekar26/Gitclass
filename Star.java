class Star{
	int size;
	String name;
	String color;
	String type;
	
	public Star(){
		System.out.println("Star is Shining);
	}
	public static void main(String[] values){
		Star star1=new Star();
		star1.size=10;
		star1.name="Betelgeuse";
		star1.color="Yellow";
		star1.type="Red Dwarfs";
		System.out.println("Size:"+star1.size+", Name:"+star1.name+", Color:"+star1.color+", StarType:"+star1.type);
		
		Star star2=new Star();
		star2.size=11;
		star2.name="Sirius";
		star2.color="Brown";
		star2.type="Main Sequence Stars";
		System.out.println("Size:"+star2.size+", Name:"+star2.name+", Color:"+star2.color+", StarType:"+star2.type);
		
		Star star3=new Star();
		star3.size=12;
		star3.name="Rigel";
		star3.color="Blue";
		star3.type="yellow Dwarfs";
		System.out.println("Size:"+star3.size+", Name:"+star3.name+", Color:"+star3.color+", StarType:"+star3.type);
		
		Star star4=new Star();
		star4.size=13;
		star4.name="Polaris";
		star4.color="Orange";
		star4.type="Blue Giants";
		System.out.println("Size:"+star4.size+", Name:"+star4.name+", Color:"+star4.color+", StarType:"+star4.type);
		
		Star star5=new Star();
		star5.size=14;
		star5.name="Alpha Centauri";
		star5.color="Red";
		star5.type="Red Giants";
		System.out.println("Size:"+star5.size+", Name:"+star5.name+", Color:"+star5.color+", StarType:"+star5.type);
		
		Star star6=new Star();
		star6.size=15;
		star6.name="Vega";
		star6.color="Green";
		star6.type="Supergiants";
		System.out.println("Size:"+star6.size+", Name:"+star6.name+", Color:"+star6.color+", StarType:"+star6.type);
		
		Star star7=new Star();
		star7.size=16;
		star7.name="Antares";
		star7.color="Purple";
		star7.type="White Dwarfs";
		System.out.println("Size:"+star7.size+", Name:"+star7.name+", Color:"+star7.color+", StarType:"+star7.type);
		
		Star star8=new Star();
		star8.size=17;
		star8.name="Arcturus";
		star8.color="Pink";
		star8.type="Neutron Stars";
		System.out.println("Size:"+star8.size+", Name:"+star8.name+", Color:"+star8.color+", StarType:"+star8.type);
		
		Star star9=new Star();
		star9.size=18;
		star9.name="Altair";
		star9.color="White";
		star9.type="Black Holes";
		System.out.println("Size:"+star9.size+", Name:"+star9.name+", Color:"+star9.color+", StarType:"+star9.type);
		
		Star star10=new Star();
		star10.size=19;
		star10.name="Procyon";
		star10.color="White-Orange";
		star10.type="Brown Dwarfs";
		System.out.println("Size:"+star10.size+". Name:"+star10.name+", Color:"+star10.color+", StarType:"+star10.type);
	}
}