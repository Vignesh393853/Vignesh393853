import java.util.Scanner; 
class UserInterface{
static Scanner s=new Scanner(System.in); 
static boolean b=true;
static Mobile m=new Mobile("Mi", "Black","128gb", "8gb"); 
public static void main(String[] args)
	{

do 
		{
System.out.println("\t Welcome To Sangita\n"); 
System.out.println("Enter The Input\n"); 
System.out.println("1.Details Of Mobile\n2.Details of Sim\n3.Add Sim\n4. Remove Sim\ns. Is Sim Present\n6.Exit\n"); 
int input=s.nextInt();
switch (input)
			{
case 1:m.detailsOfMobile();
break; 
	case 2:
				{
			if(m.slot!=null) 
	m.slot.detailsOfSim(); 
			else
	System.out.println("No Sim To Display Detsils");
	break;
				}
	case 3:m.addSim(new Sim("Jio","1ps","5g"));
	break; 
	case 4:m.removeSim();
	break;
	case 5:{ 
		if(m.isSimPresent())
		System.out.println("Yes"); 
	else 
		System.out.println("No");
	break; 
	} 
	case 6:b=false;
	break; 
	default:System.out.println("Please Enter The Valid Input"); 
	} } while (b); 
System.out.println("\t******Thank You\"*******"); 
}
}