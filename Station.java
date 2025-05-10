class Station{
	public static void send(String ref){
		System.out.println("Sending");
		System.out.println("Ref:"+ref);
		DeliveryGuy.accept(ref);
	}
}