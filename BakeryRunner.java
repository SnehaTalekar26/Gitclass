class BakeryRunner{
	public static void main(String[] args){
		String item="Sweets";
		int size=10;
		
		boolean isOpen=true;
		boolean isClose=true;
		
		String Ownername="Sneha";
		String Cashiername="Ananya";
		
		Bakery.buy(item,size);
		Bakery.open(isOpen);
		Bakery.close(isClose);
		Bakery.owner(Ownername);
		Bakery.cashier(Cashiername);
	}
}