class Lamp{
	int Wattage;
	String color;
	boolean isOn;
	double height;
	
	public Lamp(){
		System.out.println("Lamp is used to glow");
	}
	public static void main(String[] values){
		Lamp lamp1=new Lamp();
		lamp1.Wattage=5;
		lamp1.color="Black";
		lamp1.isOn=true;
		lamp1.height=10;
		System.out.println("Wattage:"+lamp1.Wattage+", color:"+lamp1.color+", IsOn:"+lamp1.isOn+", Lampheight:"+lamp1.height);
		
		Lamp lamp2=new Lamp();
		lamp2.Wattage=10;
		lamp2.color="Blue";
		lamp2.isOn=false;
		lamp2.height=20;
		System.out.println("Wattage:"+lamp2.Wattage+", color:"+lamp2.color+", IsOn:"+lamp2.isOn+", Lampheight:"+lamp2.height);
		
		Lamp lamp3=new Lamp();
		lamp3.Wattage=15;
		lamp3.color="Gray";
		lamp3.isOn=true;
		lamp3.height=30;
		System.out.println("Wattage:"+lamp3.Wattage+", color:"+lamp3.color+", IsOn:"+lamp3.isOn+", Lampheight:"+lamp3.height);
		
		Lamp lamp4=new Lamp();
		lamp4.Wattage=20;
		lamp4.color="Silver";
		lamp4.isOn=false;
		lamp4.height=40;
		System.out.println("Wattage:"+lamp4.Wattage+", color:"+lamp4.color+", IsOn:"+lamp4.isOn+", Lampheight:"+lamp4.height);
		
		Lamp lamp5=new Lamp();
		lamp5.Wattage=25;
		lamp5.color="Beige";
		lamp5.isOn=false;
		lamp5.height=30;
		System.out.println("Wattage:"+lamp5.Wattage+", color:"+lamp5.color+", IsOn:"+lamp5.isOn+", Lampheight:"+lamp5.height);
		
		Lamp lamp6=new Lamp();
		lamp6.Wattage=40;
		lamp6.color="Brown";
		lamp6.isOn=true;
		lamp6.height=20;
		System.out.println("Wattage:"+lamp6.Wattage+", color:"+lamp6.color+", IsOn:"+lamp6.isOn+", Lampheight:"+lamp6.height);
		
		Lamp lamp7=new Lamp();
		lamp7.Wattage=60;
		lamp7.color="OffWhite";
		lamp7.isOn=false;
		lamp7.height=50;
		System.out.println("Wattage:"+lamp7.Wattage+", color:"+lamp7.color+", IsOn:"+lamp7.isOn+", Lampheight:"+lamp7.height);
		
		Lamp lamp8=new Lamp();
		lamp8.Wattage=75;
		lamp8.color="LightBlack";
		lamp8.isOn=true;
		lamp8.height=60;
		System.out.println("Wattage:"+lamp8.Wattage+", color:"+lamp8.color+", IsOn:"+lamp8.isOn+", Lampheight:"+lamp8.height);
		
		Lamp lamp9=new Lamp();
		lamp9.Wattage=100;
		lamp9.color="PaperWhite";
		lamp9.isOn=true;
		lamp9.height=90;
		System.out.println("Wattage:"+lamp9.Wattage+", color:"+lamp9.color+", IsOn:"+lamp9.isOn+", Lampheight:"+lamp9.height);
		
		Lamp lamp10=new Lamp();
		lamp10.Wattage=150;
		lamp10.color="PureWhite";
		lamp10.isOn=true;
		lamp10.height=70;
		System.out.println("Wattage:"+lamp10.Wattage+". color:"+lamp10.color+", IsOn:"+lamp10.isOn+", Lampheight:"+lamp10.height);
	}
}