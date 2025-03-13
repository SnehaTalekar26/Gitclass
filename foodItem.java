class foodItem{
	public static void cook(String name){
		System.out.println(name);
	}
	public static void serve(int quantity){
		System.out.println(quantity);
	}
	public static void expire(int duration){
		System.out.println(duration);
	}
	public static void mix(int ingredient,int amount){
		System.out.println(ingredient+ "," +amount);
	}
	public static void preserve(String method,int duration){
		System.out.println(method+ "," +duration);
	}
	public static void pack(String material,int weight,String expiry){
		System.out.println(material+ "," +weight+ "," +expiry);
	}
	public static void setprice(int price,String currency,int total){
		System.out.println(price+ "," +currency+ "," +total);
	}
}
