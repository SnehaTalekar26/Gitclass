class Discount{
	static String applyDiscount(String value){
		if(value.equals("Sneha")){
			return "10 % discount";
		}
		else if(value.equals("Raksha")){
			return "15 % discount";
		}
		else {
			return "Doesn't exist";
		}
	}
}