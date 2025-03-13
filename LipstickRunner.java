class Lipstick{
	public static void main(String[]args){
		Home.power();
	}
class Home{
	public static void power(){
		Sneha.useLipstick();
	}
}
class Sneha{
	public static void useLipstick(){
		System.out.println("Sneha applying Lipstick");
		LipstickRunner.apply();
	}
}
class LipstickRunner{
	public static void apply(){
		System.out.println("Apply running in Lipstick");
		Prize.Color();
	}
}
class Prize{
	public static void Color(){
		System.out.println("Apply running in Lipstick");
	}
}
}