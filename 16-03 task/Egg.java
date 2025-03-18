class Egg {
	String color;
	String type;
	String size;
	int weight;
	int price;
	boolean isCracked;
	
	public Egg(){
		super();
	}
	
	public Egg(String color){
		this();
		this.color=color;
	}
	
	public Egg(String color,String type){
		this(color);
		this.type=type;
	}
	
	public Egg(String color,String type,String size){
		this(color,type);
		this.size=size;
	}
	
	public Egg(String color,String type,String size,int weight){
		this(color,type,size);
		this.weight=weight;
	}
	
	public Egg(String color,String type,String size,int weight,int price){
		this(color,type,size,weight);
		this.price=price;
	}
	
	public Egg(String color,String type,String size,int weight,int price,boolean isCracked){
		this(color,type,size,weight,price);
		this.isCracked=isCracked;	
	}
	
	public void display(){
		System.out.println("Color :"+color);
		System.out.println("Type :"+type);
		System.out.println("Size  :"+size);
		System.out.println("Weight :"+weight);
		System.out.println("Price :"+price);
		System.out.println("IsCracked :"+isCracked);
	}
}