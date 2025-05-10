class Flag{
	String name;
	String color;
	boolean isFlying;
	int noOfStripes;
	
	public Flag(){
		System.out.println("Flag is used to fly");
	}
	public static void main(String[] values){
		Flag flag1=new Flag();
		flag1.name="India";
		flag1.color="Orange,White,Blue,Green";
		flag1.isFlying=true;
		flag1.noOfStripes=3;
		System.out.println("name:"+flag1.name+", color:"+flag1.color+", isFlying:"+flag1.isFlying+", FlagnoOfStripes:"+flag1.noOfStripes);
		
		Flag flag2=new Flag();
		flag2.name="United States";
		flag2.color="Red,White,Blue";
		flag2.isFlying=false;
		flag2.noOfStripes=13;
		System.out.println("name:"+flag2.name+", color:"+flag2.color+", isFlying:"+flag2.isFlying+", FlagnoOfStripes:"+flag2.noOfStripes);
		
		Flag flag3=new Flag();
		flag3.name="Canada";
		flag3.color="Red,White";
		flag3.isFlying=true;
		flag3.noOfStripes=2;
		System.out.println("name:"+flag3.name+", color:"+flag3.color+", isFlying:"+flag3.isFlying+", FlagnoOfStripes:"+flag3.noOfStripes);
		
		Flag flag4=new Flag();
		flag4.name="Brazil";
		flag4.color="Green,Yellow,Blue,White";
		flag4.isFlying=false;
		flag4.noOfStripes=0;
		System.out.println("name:"+flag4.name+", color:"+flag4.color+", isFlying:"+flag4.isFlying+", FlagnoOfStripes:"+flag4.noOfStripes);
		
		Flag flag5=new Flag();
		flag5.name="Japan";
		flag5.color="Red,White";
		flag5.isFlying=false;
		flag5.noOfStripes=0;
		System.out.println("name:"+flag5.name+", color:"+flag5.color+", isFlying:"+flag5.isFlying+", FlagnoOfStripes:"+flag5.noOfStripes);
		
		Flag flag6=new Flag();
		flag6.name="South Africa";
		flag6.color="F=Green,Gold,Black,Blue,Red,White";
		flag6.isFlying=true;
		flag6.noOfStripes=0;
		System.out.println("name:"+flag6.name+", color:"+flag6.color+", isFlying:"+flag6.isFlying+", FlagnoOfStripes:"+flag6.noOfStripes);
		
		Flag flag7=new Flag();
		flag7.name="United Kingdom";
		flag7.color="Red,White,Blue";
		flag7.isFlying=false;
		flag7.noOfStripes=0;
		System.out.println("name:"+flag7.name+", color:"+flag7.color+", isFlying:"+flag7.isFlying+", FlagnoOfStripes:"+flag7.noOfStripes);
		
		Flag flag8=new Flag();
		flag8.name="Germany";
		flag8.color="Black,Red,Gold";
		flag8.isFlying=true;
		flag8.noOfStripes=3;
		System.out.println("name:"+flag8.name+", color:"+flag8.color+", isFlying:"+flag8.isFlying+", FlagnoOfStripes:"+flag8.noOfStripes);
		
		Flag flag9=new Flag();
		flag9.name="Mexico";
		flag9.color="Green,White,Red";
		flag9.isFlying=true;
		flag9.noOfStripes=3;
		System.out.println("name:"+flag9.name+", color:"+flag9.color+", isFlying:"+flag9.isFlying+", FlagnoOfStripes:"+flag9.noOfStripes);
		
		Flag flag10=new Flag();
		flag10.name="France";
		flag10.color="Blue,White,Red";
		flag10.isFlying=true;
		flag10.noOfStripes=3;
		System.out.println("name:"+flag10.name+". color:"+flag10.color+", isFlying:"+flag10.isFlying+", FlagnoOfStripes:"+flag10.noOfStripes);
	}
}