class Bank 
{
	private int bal=12978;
	private String acc_holder_name="Arun";
	private String acc_type="Deposite Account";
	private String branch_ifc_code="Sbin00u89873";

	public int getbal()
	{
		return this.bal;

}
public String getacc_holder_name()
	{
	return  acc_holder_name;
	}
	public String getacc_type()
	{
		return acc_type;
	}
	public String getbranch_ifc_code()
	{
		return branch_ifc_code;
	}
public static void main (String [] args)
	{
	Bank s=new Bank();
	System.out.println(s.bal);
	System.out.println(s.acc_holder_name);
	System.out.println(s.acc_type);
	System.out.println(s.branch_ifc_code);


	}
}

