class MyPaper{
	public static void fold(int times){
		System.out.println(times);
	}
	public static void tear(String size){
		System.out.println(size);
	}
	public static void write(String text){
		System.out.println(text);
	}
	public static void color(String shade,int intensity){
		System.out.println(shade + intensity);
	}
	public static void printcontent(String message,String font){
		System.out.println(message + font);
	}
	public static void laminate(float thickness,String material,String finish){
		System.out.println(thickness + material + finish);
	}
	public static void recycle(String process,int duration,int energyused){
		System.out.println(process + duration + energyused);
	}
}
