class Courier{
	public static void pickUp(String name){
		System.out.println("Picking up");
		System.out.println("Name:"+name);
		Station.send(name);
	}
}