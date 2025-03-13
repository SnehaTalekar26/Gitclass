class RegionalPostOffice{
	public static void deliver(String customername,String address){
		System.out.println("Running regional post office");
		System.out.println("CustomerName:"+customername+ ",Address:"+address);
		PostHeadMaster.deliver(customername,address);
	}
}