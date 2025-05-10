class SubRegionalPostOffice{
	public static void deliver(String customername,String address){
		System.out.println("Running sub regional post office");
		System.out.println("CustomerName:"+customername+ ",Address:"+address);
		RegionalPostOffice.deliver(customername,address);
	}
}