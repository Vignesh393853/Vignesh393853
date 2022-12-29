class condition 
{
	public static void main(String[] args) 
	{
		boolean res=true?false:true;
		System.out.println((!res &&false)==false);
		boolean res2=(!res &&false)==false;
		String res3=(!res2)?"vignesh":"surya";
		System.out.println(res3);
	
	}
}
