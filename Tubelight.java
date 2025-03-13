class Tubelight{
	public static void switchon(int bright){
		System.out.println(bright);
	}
	public static void switchoff(int delay){
		System.out.println(delay);
	}
	public static void flicker(int countof){
		System.out.println(countof);
	}
	public static void replace(String brand,float wattage){
		System.out.println(brand+ "," +wattage);
	}
	public static void adjustbrightness(int level,String mode){
		System.out.println(level+ "," +mode);
	}
	public static void settimer(int hours,int minutes,String modeof){
		System.out.println(hours+ "," +minutes+ "," +modeof);
	}
	public static void analyze(float power,int lifespan,float cost){
		System.out.println(power+ "," +lifespan+ "," +cost);
	}
}
