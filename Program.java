class A1 
{
	static int a=18;
	static char ch;
	static boolean b;
	public static void main(String[] args) 
	{
		ch='a';
		int a=16;
		a=15;
		boolean b=true;
		System.out.println(b);
		A1.b=false;
		System.out.println(b);
		System.out.println(A1.a);
		A1.a=19;
		System.out.println(a);
		System.out.println(A1.a);

	}
}
