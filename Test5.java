class Test5
{
	static int a=5;
	static int c=445;
	static{
		int a=10;
			System.out.println("Hi i am SMLI");
		System.out.println(Test5.a);
	}
	static{
		System.out.println("Hi i am SMLI-1");
			System.out.println(Test5.c);

	}
	{
		System.out.println("Hi I am MLSI"+a);
	}
	Test5(){
	}
	Test5(boolean g)
	{
		System.out.println(g);
	}
	int b=10;
	String s="java";
	public static void demo(String s)
	{
		System.out.println("Hi");
	}

	public static void main(String[] args) 
	{
Test5 t=new Test5();
	}
}