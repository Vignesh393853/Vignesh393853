class BankDriver 
{
	public static void main(String[] args)throws Exception
	{
		Bank1 b=new Bank1("Vignesh");
		System.out.println("Initial Balance :"+b.getBal());
		b.deposite(3000);
		System.out.println("Balance After Deposite :"+b.getBal());
		b.withdraw(1500);
		System.out.println("Balance After withdraw :"+b.getBal());
		System.out.println("Initial Account holder: "+b.getName());
b.setName("Arun");
		System.out.println("After Modifying Account holder :"+b.getName());

	}
}