class Customer{
	public static void buy(String vegetable,int quantity){
		System.out.println("Customers buying from farm");
		System.out.println("Vegetable:"+vegetable+",Quantity:"+quantity);
		Shop.sell(vegetable,quantity);
	}
}