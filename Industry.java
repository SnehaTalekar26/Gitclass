class Industry{
	String design;
	String name;
	String type;
	int date;
	
	public Industry(){
		System.out.println("Industry is used for manufacture things");
	}
	public static void main(String[] values){
		Industry industry1=new Industry();
		industry1.design="Assembly Line";
		industry1.name="Telecommunications Industry";
		industry1.type="Manufacturing Industry";
		industry1.date=30;
		System.out.println("design:"+industry1.design+", name:"+industry1.name+", type:"+industry1.type+", Industrydate:"+industry1.date);
		
		Industry industry2=new Industry();
		industry2.design="Modular Design";
		industry2.name="Real Estate Industry";
		industry2.type="Automobile Industry";
		industry2.date=15;
		System.out.println("design:"+industry2.design+", name:"+industry2.name+", type:"+industry2.type+", Industrydate:"+industry2.date);
		
		Industry industry3=new Industry();
		industry3.design="Agile Development Design";
		industry3.name="Pharmaceutical Industry";
		industry3.type="Technology Industry";
		industry3.date=4;
		System.out.println("design:"+industry3.design+", name:"+industry3.name+", type:"+industry3.type+", Industrydate:"+industry3.date);
		
		Industry industry4=new Industry();
		industry4.design="Store Layout Design";
		industry4.name="Food and Beverage Industry";
		industry4.type="Retail Industry";
		industry4.date=10;
		System.out.println("design:"+industry4.design+", name:"+industry4.name+", type:"+industry4.type+", Industrydate:"+industry4.date);
		
		Industry industry5=new Industry();
		industry5.design="Patient-Centered Design";
		industry5.name="Fashion Industry";
		industry5.type="Healthcare Industry";
		industry5.date=26;
		System.out.println("design:"+industry5.design+", name:"+industry5.name+", type:"+industry5.type+", Industrydate:"+industry5.date);
		
		Industry industry6=new Industry();
		industry6.design="Smart Grid Design";
		industry6.name="Mining Industry";
		industry6.type="Energy Industry";
		industry6.date=7;
		System.out.println("design:"+industry6.design+", name:"+industry6.name+", type:"+industry6.type+", Industrydate:"+industry6.date);
		
		Industry industry7=new Industry();
		industry7.design="Sustainable Design";
		industry7.name="Education Industry";
		industry7.type="Construction Industry";
		industry7.date=8;
		System.out.println("design:"+industry7.design+", name:"+industry7.name+", type:"+industry7.type+", Industrydate:"+industry7.date);
		
		Industry industry8=new Industry();
		industry8.design="Warehouse Layout Design";
		industry8.name="Transport and Logistics Industry";
		industry8.type="Logistics Industry";
		industry8.date=19;
		System.out.println("design:"+industry8.design+", name:"+industry8.name+", type:"+industry8.type+", Industrydate:"+industry8.date);
		
		Industry industry9=new Industry();
		industry9.design="Lean Manufacturing Design";
		industry9.name="Finance Industry";
		industry9.type="Food Industry";
		industry9.date=5;
		System.out.println("design:"+industry9.design+", name:"+industry9.name+", type:"+industry9.type+", Industrydate:"+industry9.date);
		
		Industry industry10=new Industry();
		industry10.design="Modular and Scalable Design";
		industry10.name="Tourism Industry";
		industry10.type="Aerospace Industry";
		industry10.date=16;
		System.out.println("design:"+industry10.design+". name:"+industry10.name+", type:"+industry10.type+", Industrydate:"+industry10.date);
	}
}