class Bottle{
	String Brand;
	String color;
	boolean isFull;
	String volume;
	
	public Bottle(){
		System.out.println("Bottle is used to drink water");
	}
	public static void main(String[] values){
		Bottle bottle1=new Bottle();
		bottle1.Brand="Hydro Flask";
		bottle1.color="Black";
		bottle1.isFull=true;
		bottle1.volume="100mL";
		System.out.println("Brand:"+bottle1.Brand+", color:"+bottle1.color+", IsFull:"+bottle1.isFull+", Bottlevolume:"+bottle1.volume);
		
		Bottle bottle2=new Bottle();
		bottle2.Brand="S'well";
		bottle2.color="Blue";
		bottle2.isFull=false;
		bottle2.volume="200mL";
		System.out.println("Brand:"+bottle2.Brand+", color:"+bottle2.color+", IsFull:"+bottle2.isFull+", Bottlevolume:"+bottle2.volume);
		
		Bottle bottle3=new Bottle();
		bottle3.Brand="Nalgene";
		bottle3.color="Red";
		bottle3.isFull=true;
		bottle3.volume="300mL";
		System.out.println("Brand:"+bottle3.Brand+", color:"+bottle3.color+", IsFull:"+bottle3.isFull+", Bottlevolume:"+bottle3.volume);
		
		Bottle bottle4=new Bottle();
		bottle4.Brand="Contigo";
		bottle4.color="Brown";
		bottle4.isFull=false;
		bottle4.volume="400mL";
		System.out.println("Brand:"+bottle4.Brand+", color:"+bottle4.color+", IsFull:"+bottle4.isFull+", Bottlevolume:"+bottle4.volume);
		
		Bottle bottle5=new Bottle();
		bottle5.Brand="CamelBak";
		bottle5.color="Purple";
		bottle5.isFull=false;
		bottle5.volume="130mL";
		System.out.println("Brand:"+bottle5.Brand+", color:"+bottle5.color+", IsFull:"+bottle5.isFull+", Bottlevolume:"+bottle5.volume);
		
		Bottle bottle6=new Bottle();
		bottle6.Brand="ThermoFlask";
		bottle6.color="Pink";
		bottle6.isFull=true;
		bottle6.volume="120mL";
		System.out.println("Brand:"+bottle6.Brand+", color:"+bottle6.color+", IsFull:"+bottle6.isFull+", Bottlevolume:"+bottle6.volume);
		
		Bottle bottle7=new Bottle();
		bottle7.Brand="Yellow";
		bottle7.color="Gray";
		bottle7.isFull=false;
		bottle7.volume="140mL";
		System.out.println("Brand:"+bottle7.Brand+", color:"+bottle7.color+", IsFull:"+bottle7.isFull+", Bottlevolume:"+bottle7.volume);
		
		Bottle bottle8=new Bottle();
		bottle8.Brand="Brita";
		bottle8.color="Orange";
		bottle8.isFull=true;
		bottle8.volume="200mL";
		System.out.println("Brand:"+bottle8.Brand+", color:"+bottle8.color+", IsFull:"+bottle8.isFull+", Bottlevolume:"+bottle8.volume);
		
		Bottle bottle9=new Bottle();
		bottle9.Brand="Takeya";
		bottle9.color="White";
		bottle9.isFull=true;
		bottle9.volume="250mL";
		System.out.println("Brand:"+bottle9.Brand+", color:"+bottle9.color+", IsFull:"+bottle9.isFull+", Bottlevolume:"+bottle9.volume);
		
		Bottle bottle10=new Bottle();
		bottle10.Brand="Simple Modern";
		bottle10.color="Green";
		bottle10.isFull=true;
		bottle10.volume="300mL";
		System.out.println("Brand:"+bottle10.Brand+". color:"+bottle10.color+", IsFull:"+bottle10.isFull+", Bottlevolume:"+bottle10.volume);
	}
}