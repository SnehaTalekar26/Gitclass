class Paper{
	public static void fold(int newtimes){
		System.out.println(newtimes);
	}
	public static void tear(int size){
		System.out.println(size);
	}
	public static void write(String text){
		System.out.println(text);
	}
	public static void color(String shade,float intensity){
		System.out.println(shade+ "," +intensity);
	}
	public static void printcontent(String Shape,String font){
		System.out.println(Shape+ "," +font);
	}
	public static void laminate(float thickness,String material,String finish){
		System.out.println(thickness+ "," +material+ "," +finish);
	}
	public static void recycle(String process,int duration,float energyused){
		System.out.println(process+ "," +duration+ "," +energyused);
	}
}

