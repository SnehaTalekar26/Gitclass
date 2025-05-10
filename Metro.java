class Metro{
	int price;
	String name;
	boolean isAvailable;
	int num;
	
	public Metro(){
		System.out.println("Metro is easy to travel");
	}
	public static void main(String[] values){
		Metro metro1=new Metro();
		metro1.price=20;
		metro1.name="M.G.Road";
		metro1.isAvailable=true;
		metro1.num=3;
		System.out.println("price:"+metro1.price+", name:"+metro1.name+", isAvailable:"+metro1.isAvailable+", MetroNum:"+metro1.num);
		
		Metro metro2=new Metro();
		metro2.price=30;
		metro2.name="Cubbon Park";
		metro2.isAvailable=false;
		metro2.num=5;
		System.out.println("price:"+metro2.price+", name:"+metro2.name+", isAvailable:"+metro2.isAvailable+", MetroNum:"+metro2.num);
		
		Metro metro3=new Metro();
		metro3.price=10;
		metro3.name="Kempegowda Station";
		metro3.isAvailable=false;
		metro3.num=4;
		System.out.println("price:"+metro3.price+", name:"+metro3.name+", isAvailable:"+metro3.isAvailable+", MetroNum:"+metro3.num);
		
		Metro metro4=new Metro();
		metro4.price=40;
		metro4.name="Baiyappanahalli";
		metro4.isAvailable=true;
		metro4.num=1;
		System.out.println("price:"+metro4.price+", name:"+metro4.name+", isAvailable:"+metro4.isAvailable+", MetroNum:"+metro4.num);
		
		Metro metro5=new Metro();
		metro5.price=60;
		metro5.name="Indiranagar";
		metro5.isAvailable=false;
		metro5.num=6;
		System.out.println("price:"+metro5.price+", name:"+metro5.name+", isAvailable:"+metro5.isAvailable+", MetroNum:"+metro5.num);
		
		Metro metro6=new Metro();
		metro6.price=70;
		metro6.name="HAL";
		metro6.isAvailable=true;
		metro6.num=7;
		System.out.println("price:"+metro6.price+", name:"+metro6.name+", isAvailable:"+metro6.isAvailable+", MetroNum:"+metro6.num);
		
		Metro metro7=new Metro();
		metro7.price=80;
		metro7.name="Yelachenahalli";
		metro7.isAvailable=false;
		metro7.num=8;
		System.out.println("price:"+metro7.price+", name:"+metro7.name+", isAvailable:"+metro7.isAvailable+", MetroNum:"+metro7.num);
		
		Metro metro8=new Metro();
		metro8.price=90;
		metro8.name="Banashankari";
		metro8.isAvailable=true;
		metro8.num=9;
		System.out.println("price:"+metro8.price+", name:"+metro8.name+", isAvailable:"+metro8.isAvailable+", MetroNum:"+metro8.num);
		
		Metro metro9=new Metro();
		metro9.price=100;
		metro9.name="Jayanagar";
		metro9.isAvailable=true;
		metro9.num=5;
		System.out.println("price:"+metro9.price+", name:"+metro9.name+", isAvailable:"+metro9.isAvailable+", MetroNum:"+metro9.num);
		
		Metro metro10=new Metro();
		metro10.price=110;
		metro10.name="Vidhana Soudha";
		metro10.isAvailable=false;
		metro10.num=6;
		System.out.println("price:"+metro10.price+". name:"+metro10.name+", isAvailable:"+metro10.isAvailable+", MetroNum:"+metro10.num);
	}
}