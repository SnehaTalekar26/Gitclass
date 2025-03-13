class Agent{
	public static void purchase(String vegetable,int quantity){
		System.out.println("Agent of farm");
		System.out.println("Vegetable:"+vegetable+",Quantity:"+quantity);
		Broker.brokage(vegetable,quantity);
	}
}