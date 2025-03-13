class Earth{
	double radius;
	String atmosphere;
	boolean hasLife;
	double distance;
	
	public Earth(){
		System.out.println("Earth is used to live");
	}
	public static void main(String[] values){
		Earth earth1=new Earth();
		earth1.radius=6371;
		earth1.atmosphere="Troposphere";
		earth1.hasLife=true;
		earth1.distance=149.6;
		System.out.println("radius:"+earth1.radius+", atmosphere:"+earth1.atmosphere+", hasLife:"+earth1.hasLife+", Earthdistance:"+earth1.distance);
		
		Earth earth2=new Earth();
		earth2.radius=384400;
		earth2.atmosphere="Stratosphere";
		earth2.hasLife=false;
		earth2.distance=20;
		System.out.println("radius:"+earth2.radius+", atmosphere:"+earth2.atmosphere+", hasLife:"+earth2.hasLife+", Earthdistance:"+earth2.distance);
		
		Earth earth3=new Earth();
		earth3.radius=54.6;
		earth3.atmosphere="Mesosphere";
		earth3.hasLife=true;
		earth3.distance=30;
		System.out.println("radius:"+earth3.radius+", atmosphere:"+earth3.atmosphere+", hasLife:"+earth3.hasLife+", Earthdistance:"+earth3.distance);
		
		Earth earth4=new Earth();
		earth4.radius=401;
		earth4.atmosphere="Thermosphere";
		earth4.hasLife=false;
		earth4.distance=40;
		System.out.println("radius:"+earth4.radius+", atmosphere:"+earth4.atmosphere+", hasLife:"+earth4.hasLife+", Earthdistance:"+earth4.distance);
		
		Earth earth5=new Earth();
		earth5.radius=38;
		earth5.atmosphere="Exosphere";
		earth5.hasLife=false;
		earth5.distance=30;
		System.out.println("radius:"+earth5.radius+", atmosphere:"+earth5.atmosphere+", hasLife:"+earth5.hasLife+", Earthdistance:"+earth5.distance);
		
		Earth earth6=new Earth();
		earth6.radius=261;
		earth6.atmosphere="Nitrogen(78%)";
		earth6.hasLife=true;
		earth6.distance=20;
		System.out.println("radius:"+earth6.radius+", atmosphere:"+earth6.atmosphere+", hasLife:"+earth6.hasLife+", Earthdistance:"+earth6.distance);
		
		Earth earth7=new Earth();
		earth7.radius=69700;
		earth7.atmosphere="Oxygen(21%)";
		earth7.hasLife=false;
		earth7.distance=50;
		System.out.println("radius:"+earth7.radius+", atmosphere:"+earth7.atmosphere+", hasLife:"+earth7.hasLife+", Earthdistance:"+earth7.distance);
		
		Earth earth8=new Earth();
		earth8.radius=688;
		earth8.atmosphere="Carbon Dioxide(CO2)";
		earth8.hasLife=true;
		earth8.distance=60;
		System.out.println("radius:"+earth8.radius+", atmosphere:"+earth8.atmosphere+", hasLife:"+earth8.hasLife+", Earthdistance:"+earth8.distance);
		
		Earth earth9=new Earth();
		earth9.radius=1.2;
		earth9.atmosphere="Water Vapor";
		earth9.hasLife=true;
		earth9.distance=90;
		System.out.println("radius:"+earth9.radius+", atmosphere:"+earth9.atmosphere+", hasLife:"+earth9.hasLife+", Earthdistance:"+earth9.distance);
		
		Earth earth10=new Earth();
		earth10.radius=4.37;
		earth10.atmosphere="Ozone Layer(O3)";
		earth10.hasLife=true;
		earth10.distance=70;
		System.out.println("radius:"+earth10.radius+". atmosphere:"+earth10.atmosphere+", hasLife:"+earth10.hasLife+", Earthdistance:"+earth10.distance);
	}
}