class PostHeadMaster{
	public static void deliver(String customername,String address){
		System.out.println("Running post head office");
		System.out.println("CustomerName:"+customername+ ",Address:"+address);
		PostMaster.deliver(customername,address);
	}
}