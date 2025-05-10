class NailPolish {
	String color;
	String brand;
	String size;
	int duration;
	int price;
	boolean isApplied;
	
	public NailPolish(){
		super();
	}
	
	public NailPolish(String color){
		this();
		this.color=color;
	}
	
	public NailPolish(String color,String brand){
		this(color);
		this.brand=brand;
	}
	
	public NailPolish(String color,String brand,String size){
		this(color,brand);
		this.size=size;
	}
	
	public NailPolish(String color,String brand,String size,int duration){
		this(color,brand,size);
		this.duration=duration;
	}
	
	public NailPolish(String color,String brand,String size,int duration,int price){
		this(color,brand,size,duration);
		this.price=price;
	}
	
	public NailPolish(String color,String brand,String size,int duration,int price,boolean isApplied){
		this(color,brand,size,duration,price);
		this.isApplied=isApplied;	
	}
	
	public void display(){
		System.out.println("Color :"+color);
		System.out.println("Brand :"+brand);
		System.out.println("Size  :"+size);
		System.out.println("Duration :"+duration);
		System.out.println("Price :"+price);
		System.out.println("IsApplied :"+isApplied);
	}
}