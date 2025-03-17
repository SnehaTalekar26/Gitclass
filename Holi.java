class Holi {
	String color;
	String date;
	double waterUsed;
	int price;
	int duration;
	boolean isPlayed;
	
	public Holi(){
		super();
	}
	
	public Holi(String color){
		this();
		this.color=color;
	}
	
	public Holi(String color,String date){
		this(color);
		this.date=date;
	}
	
	public Holi(String color,String date,double waterUsed){
		this(color,date);
		this.waterUsed=waterUsed;
	}
	
	public Holi(String color,String date,double waterUsed,int price){
		this(color,date,waterUsed);
		this.price=price;
	}
	
	public Holi(String color,String date,double waterUsed,int price,int duration){
		this(color,date,waterUsed,price);
		this.duration=duration;
	}
	
	public Holi(String color,String date,double waterUsed,int price,int duration,boolean isPlayed){
		this(color,date,waterUsed,price,duration);
		this.isPlayed=isPlayed;	
	}
	
	public void display(){
		System.out.println("Color :"+color);
		System.out.println("Date :"+date);
		System.out.println("WaterUsed  :"+waterUsed);
		System.out.println("Price :"+price);
		System.out.println("Duration :"+duration);
		System.out.println("IsPlayed :"+isPlayed);
	}
}