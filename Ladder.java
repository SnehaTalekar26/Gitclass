class Ladder{
	public static void adjustLadder(int length){
		System.out.println(length);
	}
	public static void moveLadder(String direction){
		System.out.println(direction);
	}
	public static void setmaterial(String material){
		System.out.println(material);
	}
	public static void climb(int height,int width){
		System.out.println(height+ "," +width);
	}
	public static void extend(int currentlength,int extralength){
		System.out.println(currentlength+ "," +extralength);
	}
	public static void paint(String color,int durability,String brand){
		System.out.println(color+ "," +durability+ "," +brand);
	}
	public static void stability(String type,String surface,int angle){
		System.out.println(type+ "," +surface+ "," +angle);
	}
}