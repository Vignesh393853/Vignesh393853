import java.util.Scanner;
class Bank1
{
	static Scanner s =new Scanner(System.in);
	private String account_hol_name;
	private long  contact=1487872540;
	private double bal=0.0;
    private String branch_name="SBI";
	Bank1()
		{
	}
	Bank1(String account_hol_name)
	{
		this.account_hol_name=account_hol_name;
	}
	
	public  void deposite(double d) 
	{
		this.bal+=d;
		System.out.println("Deposited Sucessfully");
	}
	public void withdraw(double w)
	{
		if(this.bal>=w && bal>0)
		{
			this.bal=w;
			System.out.println("Withdraw Sucessfully");
		}
	}
	public int otp()
	{
		double res=9999*Math.random()+9999;
		return (int)res;
	}
	public String getName()
	{
		return account_hol_name;
	}
	public void setName(String n_name)throws Exception{
		System.out.println("Enter the contact Number");
		long u_con=s.nextLong();
		if(this.contact==u_con)
		{
			System.out.println("Please Enter the otp");
			int g_otp=otp();
			System.out.println(g_otp);
			int u_otp=s.nextInt();
			if(u_otp==g_otp)
			{
				this.account_hol_name=n_name;
				System.out.println("Modification Done");
			}
			else
			{
				System.out.println("OTP INCORRECT can't modify data");
			}
		}
			else
			{
				System.out.println("Contact is not matching in Records");
			}
		}
		public double getBal()
	{
			return bal;
	}
}

