class Shop{
	public static void sell(String vegetable,int quantity){
		System.out.println("Shopping from farm");
		System.out.println("Vegetable:"+vegetable+",Quantity:"+quantity);
		Agent.purchase(vegetable,quantity);
	}
}