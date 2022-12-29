class User 
{
	public static void main(String[] args) 
	{
		Bank a=new Bank();
		System.out.println("**************************************");
		System.out.println("The Balance is :"+a.getbal());
		System.out.println("The Account Holder Name is :"+a.getacc_holder_name());
		System.out.println("The Account Type is :"+a.getacc_type());
		System.out.println("The Ifsc code"+a.getbranch_ifc_code());
		System.out.println("***************************************");
	
}
}