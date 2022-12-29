class pattern1
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i<=j+n/2&&i>=j-n/2&&i+j>=n-1+n/2&&i+j<=n-1-n/2)
		System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}







		
	
}
