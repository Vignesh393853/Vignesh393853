class Test4 
{
	static int a=5;
	static{
		int a=10;
		System.out.println("Hi i am SMLI");
		System.out.println(Test4.a);
	}
	{
		System.out.println("Hi I am MLSI"+a);
	}
	Test4(){
	}
	Test4(boolean g)
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
Test4 t=new Test4();
demo("hi");
	}
}