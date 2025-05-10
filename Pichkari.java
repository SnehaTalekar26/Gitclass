class Pichkari {
	String color;
	String brand;
	double waterCapacity;
	boolean isBatteryOperated;
	int length;
	float range;
	
	public Pichkari(){
		super();
	}
	
	public Pichkari(String color){
		this();
		this.color=color;
	}
	
	public Pichkari(String color,String brand){
		this(color);
		this.brand=brand;
	}
	
	public Pichkari(String color,String brand,double waterCapacity){
		this(color,brand);
		this.waterCapacity=waterCapacity;
	}
	
	public Pichkari(String color,String brand,double waterCapacity,boolean isBatteryOperated){
		this(color,brand,waterCapacity);
		this.isBatteryOperated=isBatteryOperated;
	}
	
	public Pichkari(String color,String brand,double waterCapacity,boolean isBatteryOperated,int length){
		this(color,brand,waterCapacity,isBatteryOperated);
		this.length=length;
	}
	
	public Pichkari(String color,String brand,double waterCapacity,boolean isBatteryOperated,int length,float range){
		this(color,brand,waterCapacity,isBatteryOperated,length);
		this.range=range;	
	}
	
	public void display(){
		System.out.println("Color :"+color);
		System.out.println("Brand :"+brand);
		System.out.println("WaterCapacity  :"+waterCapacity);
		System.out.println("IsBatteryOperated :"+isBatteryOperated);
		System.out.println("Length :"+length);
		System.out.println("Range :"+range);
	}
}