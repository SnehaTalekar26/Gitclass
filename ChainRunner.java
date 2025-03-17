public class ChainRunner{
	public static void main(String...args){
		Balloon Balloon1 = new Balloon();
		Balloon1.display(); 
		Balloon Balloon2 = new Balloon("White");
		Balloon2.display();
		Balloon Balloon3 = new Balloon("Yellow","Heart");
		Balloon3.display();
		Balloon Balloon4 = new Balloon("Purple","oval","Medium");
		Balloon4.display();
		Balloon Balloon5 = new Balloon("Blue","Heart","Small",5);
		Balloon5.display();
		Balloon Balloon6 = new Balloon("pink","Alphabet","Large",3,75);
		Balloon6.display();
		Balloon Balloon7 = new Balloon("silver","oval","Medium",5,15,1);
		Balloon7.display();
		System.out.println("--------------------------------------");'
		
		Holi Holi1 = new Holi("Red","23-02-25",23.3,25,2,true);
		Holi1.display(); 
		Holi Holi2 = new Holi("White","30-02-25",30.0,100,5,false);
		Holi2.display();
		Holi Holi3 = new Holi("Yellow","20-01-25",20.1,30,1,true);
		Holi3.display();
		Holi Holi4 = new Holi("Purple","10-04-25",10.0,20,1,true);
		Holi4.display();
		Holi Holi5 = new Holi("Blue","13-04-25",25.3,50,2,false);
		Holi5.display();
		Holi Holi6 = new Holi("Pink","2-01-25",19.4,36,4,true);
		Holi6.display();
		Holi Holi7 = new Holi("Silver","8-3-25",30.4,70,3,false);
		Holi7.display();
		System.out.println("--------------------------------------");
		
		Pichkari Pichkari1 = new Pichkari("Red","Bajaj",10.3,true,10,3.3f);
		Pichkari1.display(); 
		Pichkari Pichkari2 = new Pichkari("White","Vortex",13.2,false,15,2.6f);
		Pichkari2.display();
		Pichkari Pichkari3 = new Pichkari("Yellow","Tata",12.1,true,30,1.7f);
		Pichkari3.display();
		Pichkari Pichkari4 = new Pichkari("Purple","Aqua Splash",6.9,true,60,4.2f);
		Pichkari4.display();
		Pichkari Pichkari5 = new Pichkari("Blue","Nerf",7.2,false,100,1.9f);
		Pichkari5.display();
		Pichkari Pichkari6 = new Pichkari("Pnk","Super Soaker",9.0,false,75,2.8f);
		Pichkari6.display();
		Pichkari Pichkari7 = new Pichkari("Silver","oval",2.7,true,15,1.3f);
		Pichkari7.display();
		System.out.println("--------------------------------------");
		
	}
}