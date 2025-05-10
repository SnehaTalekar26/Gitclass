class Charger{
	String type;
	boolean isCharging;
	int power;
	
	Charger(String type,boolean isCharging,int power){
		System.out.println("Charger Runner:");
		this.type=type;
		this.isCharging=isCharging;
		this.power=power;
	}
}