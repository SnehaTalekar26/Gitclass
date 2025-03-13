class HospitalRunner{
	public static void main(String[] args){
		System.out.println("Many patients are in hospital");
		String pname="Jack";
		int year=20;
		String mob="0123456789";
		String mail="xyz@xworkz.in";
		String reason="fever";
		Hospital.checkup(pname,year,mob,mail,reason);
	}
}