import java.util.Scanner;
class Calculator
{
	static Scanner n=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Calculator");
		Addition();
		Subtraction();
		Division();
		Multiplication();
	}
	public static void Addition()
	{
		System.out.println("Addition");
		int a=n.nextInt();
		int b=n.nextInt();
		System.out.println(a+b);
			}
			public static void Subtraction(){
				System.out.println("Subtraction");
				int c=n.nextInt();
				int d=n.nextInt();
				System.out.println(c-d);
			}
			public static void Division()
	{
				System.out.println("Division");
				int e=n.nextInt();
				int f=n.nextInt();
				System.out.println(e/f);
	}
				public static void Multiplication()
	{
					System.out.println("Multiplication");
					int g=n.nextInt();
					int h=n.nextInt();
				System.out.println(g*h);

}
}
