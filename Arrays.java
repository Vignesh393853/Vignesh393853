import java.util.Arrays;
class Arr
{
	public static void main(String[] args) 
	{
		int[]a={1,2,3,4,5};
		a[0]=99;
		a[1]=100;
		int len=a.length;
		char d[]={'a','v'};
		char d1[]=d.clone();
		System.out.println(Arrays.toString(a));
		System.out.println((d[0]));
		System.out.println(len);
		System.out.println(d1);
	}
}
