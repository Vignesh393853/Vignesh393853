class Boo2 
{
	static int a=45;
	public static void main(String[] args) 
	{
		int a=46;
		System.out.println(a==Boo2.a);
		System.out.println(a==a);
		System.out.println('A'=='A');
		System.out.println('A'=='B');
		System.out.println('A'==65);
		System.out.println('A'=='V');

	}
}
