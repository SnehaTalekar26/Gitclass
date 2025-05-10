class Bullet{
	double weight;
	String type;
	boolean isFired;
	float diameter;
	
	public Bullet(){
		System.out.println("Bullet is used to ride");
	}
	public static void main(String[] values){
		Bullet bullet1=new Bullet();
		bullet1.weight=3.56;
		bullet1.type="Full Metal Jacket";
		bullet1.isFired=true;
		bullet1.diameter=5.56f;
		System.out.println("weight:"+bullet1.weight+", type:"+bullet1.type+", isFired:"+bullet1.isFired+", Bulletdiameter:"+bullet1.diameter);
		
		Bullet bullet2=new Bullet();
		bullet2.weight=7.45;
		bullet2.type="Hollow Point";
		bullet2.isFired=false;
		bullet2.diameter=5.56f;
		System.out.println("weight:"+bullet2.weight+", type:"+bullet2.type+", isFired:"+bullet2.isFired+", Bulletdiameter:"+bullet2.diameter);
		
		Bullet bullet3=new Bullet();
		bullet3.weight=10.0;
		bullet3.type="Soft Point";
		bullet3.isFired=true;
		bullet3.diameter=0.355f;
		System.out.println("weight:"+bullet3.weight+", type:"+bullet3.type+", isFired:"+bullet3.isFired+", Bulletdiameter:"+bullet3.diameter);
		
		Bullet bullet4=new Bullet();
		bullet4.weight=12.2;
		bullet4.type="Ballistic Tip";
		bullet4.isFired=false;
		bullet4.diameter=0.357f;
		System.out.println("weight:"+bullet4.weight+", type:"+bullet4.type+", isFired:"+bullet4.isFired+", Bulletdiameter:"+bullet4.diameter);
		
		Bullet bullet5=new Bullet();
		bullet5.weight=15.5;
		bullet5.type="Tracer Round";
		bullet5.isFired=false;
		bullet5.diameter=0.40f;
		System.out.println("weight:"+bullet5.weight+", type:"+bullet5.type+", isFired:"+bullet5.isFired+", Bulletdiameter:"+bullet5.diameter);
		
		Bullet bullet6=new Bullet();
		bullet6.weight=1.45;
		bullet6.type="Armor-Piercing";
		bullet6.isFired=true;
		bullet6.diameter=0.429f;
		System.out.println("weight:"+bullet6.weight+", type:"+bullet6.type+", isFired:"+bullet6.isFired+", Bulletdiameter:"+bullet6.diameter);
		
		Bullet bullet7=new Bullet();
		bullet7.weight=16.2;
		bullet7.type="Boat Tail";
		bullet7.isFired=false;
		bullet7.diameter=0.45f;
		System.out.println("weight:"+bullet7.weight+", type:"+bullet7.type+", isFired:"+bullet7.isFired+", Bulletdiameter:"+bullet7.diameter);
		
		Bullet bullet8=new Bullet();
		bullet8.weight=17.0;
		bullet8.type="Wadcutter";
		bullet8.isFired=true;
		bullet8.diameter=0.223f;
		System.out.println("weight:"+bullet8.weight+", type:"+bullet8.type+", isFired:"+bullet8.isFired+", Bulletdiameter:"+bullet8.diameter);
		
		Bullet bullet9=new Bullet();
		bullet9.weight=22.7;
		bullet9.type="Semi-Wadcutter";
		bullet9.isFired=true;
		bullet9.diameter=0.308f;
		System.out.println("weight:"+bullet9.weight+", type:"+bullet9.type+", isFired:"+bullet9.isFired+", Bulletdiameter:"+bullet9.diameter);
		
		Bullet bullet10=new Bullet();
		bullet10.weight=4.0;
		bullet10.type="Frangible Bullet";
		bullet10.isFired=true;
		bullet10.diameter=0.50f;
		System.out.println("weight:"+bullet10.weight+". type:"+bullet10.type+", isFired:"+bullet10.isFired+", Bulletdiameter:"+bullet10.diameter);
	}
}