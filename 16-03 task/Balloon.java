class Balloon {
	String color;
	String shape;
	String size;
	int noOfBalloon;
	int price;
	int noOfColors;
	
	public Balloon(){
		super();
	}
	
	public Balloon(String color){
		this();
		this.color=color;
	}
	
	public Balloon(String color,String shape){
		this(color);
		this.shape=shape;
	}
	
	public Balloon(String color,String shape,String size){
		this(color,shape);
		this.size=size;
	}
	
	public Balloon(String color,String shape,String size,int noOfBalloon){
		this(color,shape,size);
		this.noOfBalloon=noOfBalloon;
	}
	
	public Balloon(String color,String shape,String size,int noOfBalloon,int price){
		this(color,shape,size,noOfBalloon);
		this.price=price;
	}
	
	public Balloon(String color,String shape,String size,int noOfBalloon,int price,int noOfColors){
		this(color,shape,size,noOfBalloon,price);
		this.noOfColors=noOfColors;	
	}
	
	public void display(){
		System.out.println("Color :"+color);
		System.out.println("Shape :"+shape);
		System.out.println("Size  :"+size);
		System.out.println("NoOfBalloon :"+noOfBalloon);
		System.out.println("Price :"+price);
		System.out.println("NoOfColors :"+noOfColors);
	}
}