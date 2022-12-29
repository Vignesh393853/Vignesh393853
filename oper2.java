class Notopr
{
	public static void main(String[] args) 
	{
		
		boolean b=!(false||true);
		System.out.println(b);
		boolean res=!(5<3 && 4>1)||true||false;
		System.out.println(!res);
		boolean res2=!(res!=false) && (res==res);
		System.out.println(!res2);
	}
}
