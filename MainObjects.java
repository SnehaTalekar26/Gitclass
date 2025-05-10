class MainObjects{
	public static void main(String[] args){
	int len=10;
	String dir="upper";
	String mat="Steel";
	int high=10;
	int wide=340;
	int currentlen=12;
	int extralen=14;
	String draw="Gray";
	int time=4;
	String name="Gorilla";
	String run="Telescopic";
	String surf="Punctures";
	int ang=70;
		Ladder.adjustLadder(len);
		Ladder.moveLadder(dir);
		Ladder.setmaterial(mat);
		Ladder.climb(high,wide);
		Ladder.extend(currentlen,extralen);
		Ladder.paint(draw,time,name);
		Ladder.stability(run,surf,ang);
	
	System.out.println(" ");
		
	String cookName="Harish";
	int many=10;
	int limit=30;
	int food=4;
	int money=40;
	String idea="fridge";
	int days=3;
	String type="plastic";
	int weigh=12;
	String due="days";
	int rupee=20;
	String inr="dollor";
	int fine=100;
		foodItem.cook(cookName);
		foodItem.serve(many);
		foodItem.expire(limit);
		foodItem.mix(food,money);
		foodItem.preserve(idea,days);
		foodItem.pack(type,weigh,due);
		foodItem.setprice(rupee,inr,fine);
	
	System.out.println(" ");
	
	int newtimes=10;
	int size=4;
	String text="Hello World";
	String shade="Black";
	float intensity=4.6f;
	String Shape="rectangle";
	String font="new roman";
	float thickness=0.41f;
	String material="carbon";
	String finish="on process";
	String process="processing";
	int duration=4;
	float energyused=10.4f;
		Paper.fold(newtimes);
		Paper.tear(size);
		Paper.write(text);
		Paper.color(shade,intensity);
		Paper.printcontent(Shape,font);
		Paper.laminate(thickness,material,finish);
		Paper.recycle(process,duration,energyused);
		
	System.out.println(" ");
	
	int amount=600;
	float temperature=2.3f;
	int times=10;
	String location="goa";
	int durationtook=7;
	String tool="opener";
	float force=12.4f;
	String beverage="water";
	float ratio=1.4f;
	int ice=10;
	String taste="good";
	String aroma="verygood";
	String foam="excellent";
		Beer.pour(amount);
		Beer.chill(temperature);
		Beer.sip(times);
		Beer.store(location,durationtook);
		Beer.openbottle(tool,force);
		Beer.mixwith(beverage,ratio,ice);
		Beer.ratequality(taste,aroma,foam);
	
	System.out.println(" ");
		
	String textin="Hello Students";
	String erasertype="duster";
	String solution="cloth";
	float strength=3.4f;
	String shapeon="round";
	float position=10.2f;
	String mechanism="height";
	String typeof="graph";
	float sizeof=4.6f;
	String colorof="black";
	int brightness=23;
	String contrast="Vibrant";
	String resolution="pixels";
		Whiteboard.writeon(textin);
		Whiteboard.erase(erasertype);
		Whiteboard.clean(solution);
		Whiteboard.attachmagnet(strength,shapeon);
		Whiteboard.setheight(position,mechanism);
		Whiteboard.drawchart(typeof,sizeof,colorof);
		Whiteboard.projectdisplay(brightness,contrast,resolution);
	
	System.out.println(" ");
		
	float pressure=2.3f;
	float forceof=1.3f;
	String detergent="SurfExcel";
	String recipient="child";
	String occasion="Birthday";
	String outfit="dress";
	String accessory="necklace";
	String furtype="soft";
	float sizeofteddy=12.4f;
	String sound="growl";
	String shelf="wooden";
	String lighting="nightlights";
	String positionof="Up";
		TeddyBear.hug(pressure);
		TeddyBear.squeeze(forceof);
		TeddyBear.wash(detergent);
		TeddyBear.gift(recipient,occasion);
		TeddyBear.dressup(outfit,accessory);
		TeddyBear.customize(furtype,sizeofteddy,sound);
		TeddyBear.display(shelf,lighting,positionof);
	
	System.out.println(" ");
	
	int bright=10;
	int delay=2;
	int countof=3;
	String brand="philips";
	float wattage=40f;
	int level=12;
	String mode="night";
	int hours=12;
	int minutes=234;
	String modeof="dark";
	float power=2.3f;
	int lifespan=3;
	float cost=200f;
		Tubelight.switchon(bright);
		Tubelight.switchoff(delay);
		Tubelight.flicker(countof);
		Tubelight.replace(brand,wattage);
		Tubelight.adjustbrightness(level,mode);
		Tubelight.settimer(hours,minutes,modeof);
		Tubelight.analyze(power,lifespan,cost);
	}
}