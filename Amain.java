class Amain{
	public static void main(String[] args){
		String mobileNo="9832823123";
		String name=Mart.days(mobileNo);
		System.out.println(name);
		
		System.out.println("--------------------");
		
		String companyName="X-workz";
		String ownerName=Mart.Back(companyName);
		System.out.println(ownerName);
		
		System.out.println("--------------------");
		
		String foodItem="Biryani";
		int price=Mart.Food(foodItem);
		System.out.println(price);
		
		System.out.println("--------------------");
		
		String accountNum="301234567892";
		String balance=Mart.Account(accountNum);
		System.out.println(balance);
		
		System.out.println("--------------------");
		
		String source="Amazon Echo Dot";
		String priceof=Mart.Sour(source);
		System.out.println(priceof);
		
		System.out.println("--------------------");
		
		String nameof="Aiden";
		String alive=Mart.Lives(nameof);
		System.out.println(alive);
	}
}