class Met
{
	public static void main(String[] args) 
	{
		System.out.println("Hii from main...!");
		demo();
		System.out.println("Bye from main.....!");
	}
	public static void demo()
	{
		System.out.println(" Hiii from demo.....* ");
		demo1(50);
			}
			public static void demo1(double a)
				{
				System.out.println("Hii from demo1....!");
				int res=demo2(100);
				System.out.println(res);
				}
			public static int demo2 (int a)
	{
				System.out.println("Hiii from demo2.....!");
				return (int)a;

	}
	}

