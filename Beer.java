class Beer{
	public static void pour(int amount){
		System.out.println(amount);
	}
	public static void chill(float temperature){
		System.out.println(temperature);
	}
	public static void sip(int times){
		System.out.println(times);
	}
	public static void store(String location,int durationtook){
		System.out.println(location+ "," +durationtook);
	}
	public static void openbottle(String tool,float force){
		System.out.println(tool+ "," +force);
	}
	public static void mixwith(String beverage,float ratio,int ice){
		System.out.println(beverage+ "," +ratio+ "," +ice);
	}
	public static void ratequality(String taste,String aroma,String foam){
		System.out.println(taste+ "," +aroma+ "," +foam);
	}
}
