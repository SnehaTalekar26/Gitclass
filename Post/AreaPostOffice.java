class AreaPostOffice{
	public static void deliver(String customername,String address){
		System.out.println("Running Area post office");
		System.out.println("CustomerName:"+customername+ ",Address:"+address);
		SubRegionalPostOffice.deliver(customername,address);
	}
}