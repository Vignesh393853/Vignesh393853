import java.util.*;
class Methp
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []args)
	{
		System.out.println("Enter the Number");
		int given=s.nextInt();
		factors(given);
		System.out.println("******************");
		System.out.println("Enter To check prime or not");
		int num_p=s.nextInt();
		if(isPrime(num_p))
		System.out.println("The Given Number is"+num_p+" Prime");
		else
		System.out.println("The Given Number is"+num_p+" Not Prime");
		System.out.println("*******************************************");
			System.out.println("Enter To check Perfect or not");
			System.out.println(" Enter a Number: ");
		int Num = s.nextInt();
			if (perfect(Num))
				System.out.println(Num+" is a Perfect Number"); 
             else 
					System.out.println(Num+" is NOT a Perfect Number");
			 System.out.println("************************************!!!!!!!!!!!!!");
					
					
	}
	public static void factors(int given)
	{
		for(int i=1;i<given;i++)
			{
			if (given%i==0)
      System.out.println("Factors of"+given+"is:"+i);
			}
	}
	public static boolean isPrime(int num)
	{
		int count=0;
		for (int i=1;i<=num ;i++ )
		{
     if (num%i==0)
		 count++;
     }
	 if(count==2)
		 return true;
		 else
			 return false;
		}
		public static boolean perfect(int Num)
        { 
	
	int i,Sum = 0 ; 
	for(i = 1 ; i < Num ; i++) 
	{ 
		if(Num%i == 0)
		{
			Sum = Sum + i;
			}
			}
			if(Sum==Num)
				return true;
			else 
				return false;
		}	
		}
