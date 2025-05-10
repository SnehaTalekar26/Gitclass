class PowerBank{
	String type;
	String name;
	boolean isCharging;
	String capacity;
	
	public PowerBank(){
		System.out.println("PowerBank is used to charge");
	}
	public static void main(String[] values){
		PowerBank powerbank1=new PowerBank();
		powerbank1.type="Lithium-Ion Power Bank";
		powerbank1.name="Anker PowerCore 10000";
		powerbank1.isCharging=true;
		powerbank1.capacity="1000mAh";
		System.out.println("type:"+powerbank1.type+", name:"+powerbank1.name+", IsCharging:"+powerbank1.isCharging+", PowerBankCapacity:"+powerbank1.capacity);
		
		PowerBank powerbank2=new PowerBank();
		powerbank2.type="Lithium-Polymer (LiPo) Power Bank";
		powerbank2.name="RAVPower 26800mAh Power Bank";
		powerbank2.isCharging=false;
		powerbank2.capacity="2000mAh";
		System.out.println("type:"+powerbank2.type+", name:"+powerbank2.name+", IsCharging:"+powerbank2.isCharging+", PowerBankCapacity:"+powerbank2.capacity);
		
		PowerBank powerbank3=new PowerBank();
		powerbank3.type="Solar Power Bank";
		powerbank3.name="Xiaomi Mi Power Bank 3 Pro";
		powerbank3.isCharging=true;
		powerbank3.capacity="3000mAh";
		System.out.println("type:"+powerbank3.type+", name:"+powerbank3.name+", IsCharging:"+powerbank3.isCharging+", PowerBankCapacity:"+powerbank3.capacity);
		
		PowerBank powerbank4=new PowerBank();
		powerbank4.type="Portable Charger with Wireless Charging";
		powerbank4.name="Zendure A8QC 26800mAh";
		powerbank4.isCharging=false;
		powerbank4.capacity="4000mAh";
		System.out.println("type:"+powerbank4.type+", name:"+powerbank4.name+", IsCharging:"+powerbank4.isCharging+", PowerBankCapacity:"+powerbank4.capacity);
		
		PowerBank powerbank5=new PowerBank();
		powerbank5.type="High-Capacity Power Bank";
		powerbank5.name="Aukey PB-N50 20000mAh";
		powerbank5.isCharging=false;
		powerbank5.capacity="10000mAh";
		System.out.println("type:"+powerbank5.type+", name:"+powerbank5.name+", IsCharging:"+powerbank5.isCharging+", PowerBankCapacity:"+powerbank5.capacity);
		
		PowerBank powerbank6=new PowerBank();
		powerbank6.type="Slim and Compact Power Bank";
		powerbank6.name="Belkin Boost Charge 10000mAh Power Bank";
		powerbank6.isCharging=true;
		powerbank6.capacity="12000mAh";
		System.out.println("type:"+powerbank6.type+", name:"+powerbank6.name+", IsCharging:"+powerbank6.isCharging+", PowerBankCapacity:"+powerbank6.capacity);
		
		PowerBank powerbank7=new PowerBank();
		powerbank7.type="Multi-Port Power Bank";
		powerbank7.name="Mophie Powerstation XXL";
		powerbank7.isCharging=false;
		powerbank7.capacity="14000mAh";
		System.out.println("type:"+powerbank7.type+", name:"+powerbank7.name+", IsCharging:"+powerbank7.isCharging+", PowerBankCapacity:"+powerbank7.capacity);
		
		PowerBank powerbank8=new PowerBank();
		powerbank8.type="Fast Charging Power Bank";
		powerbank8.name="Romoss Sense 8+ 30000mAh";
		powerbank8.isCharging=true;
		powerbank8.capacity="20000mAh";
		System.out.println("type:"+powerbank8.type+", name:"+powerbank8.name+", IsCharging:"+powerbank8.isCharging+", PowerBankCapacity:"+powerbank8.capacity);
		
		PowerBank powerbank9=new PowerBank();
		powerbank9.type="Car Jump Starter Power Bank";
		powerbank9.name="Adata P20000D Power Bank";
		powerbank9.isCharging=true;
		powerbank9.capacity="25000mAh";
		System.out.println("type:"+powerbank9.type+", name:"+powerbank9.name+", IsCharging:"+powerbank9.isCharging+", PowerBankCapacity:"+powerbank9.capacity);
		
		PowerBank powerbank10=new PowerBank();
		powerbank10.type="Battery Pack for Laptops";
		powerbank10.name="Omnicharge Omni 20+ 20000mAh Power Bank";
		powerbank10.isCharging=true;
		powerbank10.capacity="30000mAh";
		System.out.println("type:"+powerbank10.type+". name:"+powerbank10.name+", IsCharging:"+powerbank10.isCharging+", PowerBankCapacity:"+powerbank10.capacity);
	}
}