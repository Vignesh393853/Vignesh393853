class GF
{
	public static void main(String[] args) 
	{
		int [] arr =new int[4];
		try
		{
		int i =arr[4];
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
         System.out.println("excepton caught in catch block");
		}
		finally{
		System.out.println("Finally exe");
	}
}
}
