class Broker{
	public static void brokage(String vegetable,int quantity){
		System.out.println("Broker of farm");
		System.out.println("Vegetable:"+vegetable+",Quantity:"+quantity);
		Farmer.farm(vegetable,quantity);
	}
}