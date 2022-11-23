import java.util.Scanner;
class App
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("********** WELCOME TO THE TOMATTO *********");
		System.out.println("ARE YOU HUNGRY !......"+(char)1+"\n");
		Thread.sleep(1000);
		System.out.println("Please Select Your Resturant\n");
		Thread.sleep(1000);
		System.out.println("1.AL-SAFA\n2.EATS_OF_ARBS\n3.S S HYDERBAD\n4.BUHARI\n5.EXIT");
		int hotel=s.nextInt();
		switch(hotel)
		{
			case 1:
			{
				System.out.println("\t THANKS FOR SELECTING     ************ AL-SAFA********         \t"+(char)1+"\n");
				Thread.sleep(1000);
				System.out.println("1.Special Briyani\n2.Dum Briyani\n3.Chicken Briyani\n4.Mutton Briyani\n5.Exit");
				int food=s.nextInt();
				switch(food)
				{
					case 1:
					{
						int price=120;
						System.out.println("Please Enter The Quantity:\n");
						Thread.sleep(1000);
						int qty=s.nextInt();
						double bill=qty*price;
						System.out.println("Total Price is :\n"+bill+"\n");
						Thread.sleep(1000);
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment=s.nextInt();
						switch(payment)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount=s.nextDouble();
								if(amount==bill)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp=9999*Math.random()+9999;
									int check=(int)otp;
									System.out.println(check);
									int otp_in=s.nextInt();
									if(check==otp_in)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								break;}
							}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount1=s.nextDouble();
								if(amount1==bill)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp1=9999*Math.random()+9999;
									int check1=(int)otp1;
									System.out.println(check1);
									int otp_in1=s.nextInt();
									if(check1==otp_in1)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount2=s.nextDouble();
								if(amount2==bill)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp2=9999*Math.random()+9999;
									int check2=(int)otp2;
									System.out.println(check2);
									int otp_in2=s.nextInt();
									if(check2==otp_in2)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
								break;}
								case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount3=s.nextDouble();
								if(amount3==bill)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp3=9999*Math.random()+9999;
									int check3=(int)otp3;
									System.out.println(check3);
									int otp_in3=s.nextInt();
									System.out.println("Enter The Pin");
									int pin=s.nextInt();
									if(check3==otp_in3)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
						}
					break;}
					case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount4=s.nextDouble();
								if(amount4==bill)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp4=9999*Math.random()+9999;
									int check4=(int)otp4;
									System.out.println(check4);
									int otp_in4=s.nextInt();
									if(check4==otp_in4)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						}
					break;}
					case 2:
					{
						int price2=140;
						System.out.println("Please Enter The Quantity");
						int qty1=s.nextInt();
						double bill1=qty1*price2;
						System.out.println("Your Total Price is :"+bill1+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment1=s.nextInt();
						switch(payment1)
							{
								case 1:
								{
									System.out.println("Please Enter The Amount :\n");
									double amount5=s.nextDouble();
									if(amount5==bill1)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp5=9999*Math.random()+9999;
										int check5=(int)otp5;
										System.out.println(check5);
										int otp_in5=s.nextInt();
										if(check5==otp_in5)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;}
								case 2:
								{
									System.out.println("Please Enter The Amount :\n");
									double amount6=s.nextDouble();
									if(amount6==bill1)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp6=9999*Math.random()+9999;
										int check6=(int)otp6;
										System.out.println(check6);
										int otp_in6=s.nextInt();
										if(check6==otp_in6)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;}
								case 3:
								{
									System.out.println("Please Enter The Amount :\n");
									double amount7=s.nextDouble();
									if(amount7==bill1)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp7=9999*Math.random()+9999;
										int check7=(int)otp7;
										System.out.println(check7);
										int otp_in7=s.nextInt();
										if(check7==otp_in7)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;}
								case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount8=s.nextDouble();
								if(amount8==bill1)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp8=9999*Math.random()+9999;
									int check8=(int)otp8;
									System.out.println(check8);
									int otp_in8=s.nextInt();
									System.out.println("Enter The Pin");
									int pin1=s.nextInt();
									if(check8==otp_in8)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
						}
					break;}
					case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount9=s.nextDouble();
								if(amount9==bill1)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp9=9999*Math.random()+9999;
									int check9=(int)otp9;
									System.out.println(check9);
									int otp_in9=s.nextInt();
									if(check9==otp_in9)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
						}
					break;}
							}
					break;}
					case 3:
					{
						int price3=160;
						System.out.println("Please Enter The Quantity");
						int qty2=s.nextInt();
						double bill2=qty2*price3;
						System.out.println("Your Total Price is :"+bill2+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment2=s.nextInt();
						switch(payment2)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount :\n");
									double amount10=s.nextDouble();
									if(amount10==bill2)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp10=9999*Math.random()+9999;
										int check10=(int)otp10;
										System.out.println(check10);
										int otp_in10=s.nextInt();
										if(check10==otp_in10)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;}
								case 2:
							{
								System.out.println("Please Enter The Amount :\n");
									double amount11=s.nextDouble();
									if(amount11==bill2)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp11=9999*Math.random()+9999;
										int check11=(int)otp11;
										System.out.println(check11);
										int otp_in11=s.nextInt();
										if(check11==otp_in11)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;
							}
							case 3:
							{
								System.out.println("Please Enter The Amount :\n");
									double amount12=s.nextDouble();
									if(amount12==bill2)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp12=9999*Math.random()+9999;
										int check12=(int)otp12;
										System.out.println(check12);
										int otp_in12=s.nextInt();
										if(check12==otp_in12)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;
							}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount13=s.nextDouble();
								if(amount13==bill2)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp13=9999*Math.random()+9999;
									int check13=(int)otp13;
									System.out.println(check13);
									int otp_in13=s.nextInt();
									System.out.println("Enter The Pin");
									int pin2=s.nextInt();
									if(check13==otp_in13)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
						}
					break;}
					case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount14=s.nextDouble();
								if(amount14==bill2)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp14=9999*Math.random()+9999;
									int check14=(int)otp14;
									System.out.println(check14);
									int otp_in14=s.nextInt();
									if(check14==otp_in14)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						}
					break;}
							case 4:
							{
								int price4=180;
						        System.out.println("Please Enter The Quantity");
						        int qty3=s.nextInt();
						        double bill3=qty3*price4;
						        System.out.println("Your Total Price is :"+bill3+"\n");
						        System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						        int payment3=s.nextInt();
						        switch(payment3)
								 {
									case 1:
									{
										
									System.out.println("Please Enter The Amount :\n");
									double amount15=s.nextDouble();
									if(amount15==bill3)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp15=9999*Math.random()+9999;
										int check15=(int)otp15;
										System.out.println(check15);
										int otp_in15=s.nextInt();
										if(check15==otp_in15)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;}
								case 2:
							{
								System.out.println("Please Enter The Amount :\n");
									double amount16=s.nextDouble();
									if(amount16==bill3)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp16=9999*Math.random()+9999;
										int check16=(int)otp16;
										System.out.println(check16);
										int otp_in16=s.nextInt();
										if(check16==otp_in16)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;
							}
							case 3:
							{
								System.out.println("Please Enter The Amount :\n");
									double amount17=s.nextDouble();
									if(amount17==bill3)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp17=9999*Math.random()+9999;
										int check17=(int)otp17;
										System.out.println(check17);
										int otp_in17=s.nextInt();
										if(check17==otp_in17)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;
							}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount18=s.nextDouble();
								if(amount18==bill3)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp18=9999*Math.random()+9999;
									int check18=(int)otp18;
									System.out.println(check18);
									int otp_in18=s.nextInt();
									System.out.println("Enter The Pin");
									int pin3=s.nextInt();
									if(check18==otp_in18)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
						}
					break;}
					case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount19=s.nextDouble();
								if(amount19==bill3)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp19=9999*Math.random()+9999;
									int check19=(int)otp19;
									System.out.println(check19);
									int otp_in19=s.nextInt();
									if(check19==otp_in19)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
								 }
							break;}
								 case 5:
								{
									System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
								}
							break;
				}
			break;}
		case 2: 
			{
				System.out.println("\tThanks For Selecting       ************* Eats_The_Arbs Resturant************         \t"+(char)1+"\n");
				Thread.sleep(1000);
				System.out.println("1.Naan With Butter Masala\n2.Briyani Combo\n3.Chic Fi lay\n4.Steak Course\n5.Exit");
				int food=s.nextInt();
				switch(food)
				{
					case 1:
					{
						int price6=180;
						System.out.println("Please Enter The Quantity");
						int qty6=s.nextInt();
						double bill6=qty6*price6;
						System.out.println("The Total Bill is :"+bill6+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment6=s.nextInt();
						switch(payment6)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount :\n");
								double amount20=s.nextDouble();
								if(amount20==bill6)
								{
									System.out.println("Please Enter The OTP : ");
									Thread.sleep(1000);
									double otp_in20=9999*Math.random()+9999;
									int check20=(int)otp_in20;
									System.out.println(check20);
									int otp20=s.nextInt();
									if(check20==otp20)
									{
										System.out.println("Processing Please Wait......");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
									}
									else
									{
										System.out.println("Please Enter The Correct PIN ");
									}

								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount :\n");
								double amount21=s.nextDouble();
								if(amount21==bill6)
								{
									System.out.println("Please Enter The OTP : ");
									Thread.sleep(1000);
									double otp_in21=9999*Math.random()+9999;
									int check21=(int)otp_in21;
									System.out.println(check21);
									int otp21=s.nextInt();
									if(check21==otp21)
									{
										System.out.println("Processing Please Wait......");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
									}
									else
									{
										System.out.println("Please Enter The Correct PIN ");
									}

									}
								break;}
								case 3:
									{
								     System.out.println("Please Enter The Amount :\n");
								      double amount22=s.nextDouble();
								      if(amount22==bill6)
									{
										System.out.println("Please Enter The OTP : ");
										Thread.sleep(1000);
										double otp22=9999*Math.random()+9999;
										int check22=(int)otp22;
										System.out.println(check22);
										int otp_in22=s.nextInt();
										if(check22==otp_in22)
										{
											System.out.println("Processing Please Wait......");
											Thread.sleep(1000);
											System.out.println((char)1+"\tYour Order is Sucessfull\t"+(char)1);
											System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);
										}
										else
										{
											System.out.println("Please Enter The Correct OTP");
										}
									}
								break;}
								case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount23=s.nextDouble();
								if(amount23==bill6)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp23=9999*Math.random()+9999;
									int check23=(int)otp23;
									System.out.println(check23);
									int otp_in23=s.nextInt();
									System.out.println("Enter The Pin");
									int pin7=s.nextInt();
									if(check23==otp_in23)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
						}
					break;}
					case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount24=s.nextDouble();
								if(amount24==bill6)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp24=9999*Math.random()+9999;
									int check24=(int)otp24;
									System.out.println(check24);
									int otp_in24=s.nextInt();
									if(check24==otp_in24)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
								}
					break;}
					case 2:
					{
						int price7=220;
						System.out.println("Please Enter The Quantity");
						int qty7=s.nextInt();
						double bill7=qty7*price7;
						System.out.println("The Total Bill is :"+bill7+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment7=s.nextInt();
						switch(payment7)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount25=s.nextDouble();
								if(amount25==bill7)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp25=9999*Math.random()+9999;
									int check25=(int)otp25;
									System.out.println(check25);
									int otp_in25=s.nextInt();
									if(check25==otp_in25)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount26=s.nextDouble();
								if(amount26==bill7)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp26=9999*Math.random()+9999;
									int check26=(int)otp26;
									System.out.println(check26);
									int otp_in26=s.nextInt();
									if(check26==otp_in26)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount27=s.nextDouble();
								if(amount27==bill7)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp27=9999*Math.random()+9999;
									int check27=(int)otp27;
									System.out.println(check27);
									int otp_in27=s.nextInt();
									if(check27==otp_in27)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount28=s.nextDouble();
								if(amount28==bill7)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp28=9999*Math.random()+9999;
									int check28=(int)otp28;
									System.out.println(check28);
									int otp_in28=s.nextInt();
									System.out.println("Enter The PIN:");
										int pin9=s.nextInt();
									if(check28==otp_in28)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount29=s.nextDouble();
								if(amount29==bill7)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp29=9999*Math.random()+9999;
									int check29=(int)otp29;
									System.out.println(check29);
									int otp_in29=s.nextInt();
									if(check29==otp_in29)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						}
					break;}
					case 3:
					{
						int price8=260;
						System.out.println("Please Enter The Quantity");
						int qty8=s.nextInt();
						double bill8=qty8*price8;
						System.out.println("The Total Bill is :"+bill8+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment8=s.nextInt();
						switch(payment8)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount31=s.nextDouble();
								if(amount31==bill8)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp31=9999*Math.random()+9999;
									int check31=(int)otp31;
									System.out.println(check31);
									int otp_in31=s.nextInt();
									if(check31==otp_in31)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount32=s.nextDouble();
								if(amount32==bill8)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp32=9999*Math.random()+9999;
									int check32=(int)otp32;
									System.out.println(check32);
									int otp_in32=s.nextInt();
									if(check32==otp_in32)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount33=s.nextDouble();
								if(amount33==bill8)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp33=9999*Math.random()+9999;
									int check33=(int)otp33;
									System.out.println(check33);
									int otp_in33=s.nextInt();
									if(check33==otp_in33)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount34=s.nextDouble();
								if(amount34==bill8)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp34=9999*Math.random()+9999;
									int check34=(int)otp34;
									System.out.println(check34);
									int otp_in34=s.nextInt();
									System.out.println("Enter Your PIN:");
									int pin10=s.nextInt();
									if(check34==otp_in34)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount35=s.nextDouble();
								if(amount35==bill8)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp35=9999*Math.random()+9999;
									int check35=(int)otp35;
									System.out.println(check35);
									int otp_in35=s.nextInt();
									if(check35==otp_in35)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						}
					break;}
					case 4:
					{
						int price9=320;
						System.out.println("Please Enter The Quantity");
						int qty9=s.nextInt();
						double bill9=qty9*price9;
						System.out.println("The Total Bill is :"+bill9+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment9=s.nextInt();
						switch(payment9)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount36=s.nextDouble();
								if(amount36==bill9)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp36=9999*Math.random()+9999;
									int check36=(int)otp36;
									System.out.println(check36);
									int otp_in36=s.nextInt();
									if(check36==otp_in36)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount37=s.nextDouble();
								if(amount37==bill9)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp37=9999*Math.random()+9999;
									int check37=(int)otp37;
									System.out.println(check37);
									int otp_in37=s.nextInt();
									if(check37==otp_in37)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount38=s.nextDouble();
								if(amount38==bill9)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp38=9999*Math.random()+9999;
									int check38=(int)otp38;
									System.out.println(check38);
									int otp_in38=s.nextInt();
									if(check38==otp_in38)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount39=s.nextDouble();
								if(amount39==bill9)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp39=9999*Math.random()+9999;
									int check39=(int)otp39;
									System.out.println(check39);
									int otp_in39=s.nextInt();
									System.out.println("Enter Your PIN :");
									int pin11=s.nextInt();
									if(check39==otp_in39)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount40=s.nextDouble();
								if(amount40==bill9)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp40=9999*Math.random()+9999;
									int check40=(int)otp40;
									System.out.println(check40);
									int otp_in40=s.nextInt();
									if(check40==otp_in40)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
				}
							break;}
							case 5:
							{
									System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
							}
							break;}
						}
						case 3:
			{
				System.out.println("\t THANKS FOR SELECTING     ************ S S HYDERBAD BRIYANI **********         \t"+(char)1+"\n");
				Thread.sleep(1000);
				System.out.println("1.Combo Briyani\n2.Hyderbad Briyani\n3.Chicken Briyani\n4.Mutton Briyani\n5.Exit");
				int food=s.nextInt();
				switch(food)
				{
					case 1:
					{
						int price7=420;
						System.out.println("Please Enter The Quantity");
						int qty7=s.nextInt();
						double bill10=qty7*price7;
						System.out.println("The Total Bill is :"+bill10+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment7=s.nextInt();
						switch(payment7)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount41=s.nextDouble();
								if(amount41==bill10)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp41=9999*Math.random()+9999;
									int check41=(int)otp41;
									System.out.println(check41);
									int otp_in41=s.nextInt();
									if(check41==otp_in41)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount42=s.nextDouble();
								if(amount42==bill10)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp42=9999*Math.random()+9999;
									int check42=(int)otp42;
									System.out.println(check42);
									int otp_in42=s.nextInt();
									if(check42==otp_in42)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount43=s.nextDouble();
								if(amount43==bill10)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp43=9999*Math.random()+9999;
									int check43=(int)otp43;
									System.out.println(check43);
									int otp_in43=s.nextInt();
									if(check43==otp_in43)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount44=s.nextDouble();
								if(amount44==bill10)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp44=9999*Math.random()+9999;
									int check44=(int)otp44;
									System.out.println(check44);
									int otp_in44=s.nextInt();
									System.out.println("Enter Your PIN :");
									int pin12=s.nextInt();
									if(check44==otp_in44)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount45=s.nextDouble();
								if(amount45==bill10)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp45=9999*Math.random()+9999;
									int check45=(int)otp45;
									System.out.println(check45);
									int otp_in45=s.nextInt();
									if(check45==otp_in45)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						}
					break;}
					case 2:
						{
							int price8=220;
						System.out.println("Please Enter The Quantity");
						int qty8=s.nextInt();
						double bill11=qty8*price8;
						System.out.println("The Total Bill is :"+bill11+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment8=s.nextInt();
						switch(payment8)
							{
								case 1:
								{
									System.out.println("Please Enter The Amount");
								double amount46=s.nextDouble();
								if(amount46==bill11)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp46=9999*Math.random()+9999;
									int check46=(int)otp46;
									System.out.println(check46);
									int otp_in46=s.nextInt();
									if(check46==otp_in46)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
								{
									System.out.println("Please Enter The Amount");
								double amount47=s.nextDouble();
								if(amount47==bill11)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp47=9999*Math.random()+9999;
									int check47=(int)otp47;
									System.out.println(check47);
									int otp_in47=s.nextInt();
									if(check47==otp_in47)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
								{
									System.out.println("Please Enter The Amount");
								double amount48=s.nextDouble();
								if(amount48==bill11)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp48=9999*Math.random()+9999;
									int check48=(int)otp48;
									System.out.println(check48);
									int otp_in48=s.nextInt();
									if(check48==otp_in48)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
								{
									System.out.println("Please Enter The Amount");
								double amount49=s.nextDouble();
								if(amount49==bill11)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp49=9999*Math.random()+9999;
									int check49=(int)otp49;
									System.out.println(check49);
									int otp_in49=s.nextInt();
									if(check49==otp_in49)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
								{
									System.out.println("Please Enter The Amount");
								double amount50=s.nextDouble();
								if(amount50==bill11)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp50=9999*Math.random()+9999;
									int check50=(int)otp50;
									System.out.println(check50);
									int otp_in50=s.nextInt();
									if(check50==otp_in50)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							}
						break;}
						case 3:
					{
							int price9=180;
						System.out.println("Please Enter The Quantity");
						int qty9=s.nextInt();
						double bill12=qty9*price9;
						System.out.println("The Total Bill is :"+bill12+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment9=s.nextInt();
						switch(payment9)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount51=s.nextDouble();
								if(amount51==bill12)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp51=9999*Math.random()+9999;
									int check51=(int)otp51;
									System.out.println(check51);
									int otp_in51=s.nextInt();
									if(check51==otp_in51)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount52=s.nextDouble();
								if(amount52==bill12)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp52=9999*Math.random()+9999;
									int check52=(int)otp52;
									System.out.println(check52);
									int otp_in52=s.nextInt();
									if(check52==otp_in52)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount53=s.nextDouble();
								if(amount53==bill12)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp53=9999*Math.random()+9999;
									int check53=(int)otp53;
									System.out.println(check53);
									int otp_in53=s.nextInt();
									if(check53==otp_in53)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount54=s.nextDouble();
								if(amount54==bill12)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp54=9999*Math.random()+9999;
									int check54=(int)otp54;
									System.out.println(check54);
									int otp_in54=s.nextInt();
									if(check54==otp_in54)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount55=s.nextDouble();
								if(amount55==bill12)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp55=9999*Math.random()+9999;
									int check55=(int)otp55;
									System.out.println(check55);
									int otp_in55=s.nextInt();
									if(check55==otp_in55)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						}
					break;}
					case 4:
					{
						int price10=200;
						System.out.println("Please Enter The Quantity");
						int qty10=s.nextInt();
						double bill13=qty10*price10;
						System.out.println("The Total Bill is :"+bill13+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment9=s.nextInt();
						switch(payment9)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount56=s.nextDouble();
								if(amount56==bill13)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp56=9999*Math.random()+9999;
									int check56=(int)otp56;
									System.out.println(check56);
									int otp_in56=s.nextInt();
									if(check56==otp_in56)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount57=s.nextDouble();
								if(amount57==bill13)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp57=9999*Math.random()+9999;
									int check57=(int)otp57;
									System.out.println(check57);
									int otp_in57=s.nextInt();
									if(check57==otp_in57)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount58=s.nextDouble();
								if(amount58==bill13)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp58=9999*Math.random()+9999;
									int check58=(int)otp58;
									System.out.println(check58);
									int otp_in58=s.nextInt();
									if(check58==otp_in58)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount59=s.nextDouble();
								if(amount59==bill13)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp59=9999*Math.random()+9999;
									int check59=(int)otp59;
									System.out.println(check59);
									int otp_in59=s.nextInt();
									System.out.println("Enter Your PIN:");
									int pin12=s.nextInt();
									if(check59==otp_in59)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount60=s.nextDouble();
								if(amount60==bill13)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp60=9999*Math.random()+9999;
									int check60=(int)otp60;
									System.out.println(check60);
									int otp_in60=s.nextInt();
									if(check60==otp_in60)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
						}
					break;}
					case 5:
					{
						System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
					break;}
				}
			break;}
			case 4:
			{
				System.out.println("\t THANKS FOR SELECTING     ************ BUHARI **********         \t"+(char)1+"\n");
				Thread.sleep(1000);
				System.out.println("1.Special Briyani\n2.Dum Briyani\n3.Chicken Briyani\n4.Exit");
				int food=s.nextInt();
				switch(food)
				{
					case 1:
						{
							int price15=420;
						System.out.println("Please Enter The Quantity");
						int qty16=s.nextInt();
						double bill14=qty16*price15;
						System.out.println("The Total Bill is :"+bill14+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment13=s.nextInt();
						switch(payment13)
							{
								case 1:
								{
									System.out.println("Please Enter The Amount");
								double amount61=s.nextDouble();
								if(amount61==bill14)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp61=9999*Math.random()+9999;
									int check61=(int)otp61;
									System.out.println(check61);
									int otp_in61=s.nextInt();
									if(check61==otp_in61)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
								{
									System.out.println("Please Enter The Amount");
								double amount62=s.nextDouble();
								if(amount62==bill14)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp62=9999*Math.random()+9999;
									int check62=(int)otp62;
									System.out.println(check62);
									int otp_in62=s.nextInt();
									if(check62==otp_in62)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
								{
									System.out.println("Please Enter The Amount");
								double amount63=s.nextDouble();
								if(amount63==bill14)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp63=9999*Math.random()+9999;
									int check63=(int)otp63;
									System.out.println(check63);
									int otp_in63=s.nextInt();
									if(check63==otp_in63)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
								{
									System.out.println("Please Enter The Amount");
								double amount64=s.nextDouble();
								if(amount64==bill14)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp64=9999*Math.random()+9999;
									int check64=(int)otp64;
									System.out.println(check64);
									int otp_in64=s.nextInt();
									System.out.println("Enter Your PIN:");
									int pin17=s.nextInt();
									if(check64==otp_in64)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
								{
									System.out.println("Please Enter The Amount");
								double amount65=s.nextDouble();
								if(amount65==bill14)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp65=9999*Math.random()+9999;
									int check65=(int)otp65;
									System.out.println(check65);
									int otp_in65=s.nextInt();
									if(check65==otp_in65)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							}
						break;}
						case 2:
					{
						int price16=250;
						System.out.println("Please Enter The Quantity");
						int qty17=s.nextInt();
						double bill15=qty17*price16;
						System.out.println("The Total Bill is :"+bill15+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment14=s.nextInt();
						switch(payment14)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount66=s.nextDouble();
								if(amount66==bill15)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp66=9999*Math.random()+9999;
									int check66=(int)otp66;
									System.out.println(check66);
									int otp_in66=s.nextInt();
									if(check66==otp_in66)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount67=s.nextDouble();
								if(amount67==bill15)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp67=9999*Math.random()+9999;
									int check67=(int)otp67;
									System.out.println(check67);
									int otp_in67=s.nextInt();
									if(check67==otp_in67)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount68=s.nextDouble();
								if(amount68==bill15)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp68=9999*Math.random()+9999;
									int check68=(int)otp68;
									System.out.println(check68);
									int otp_in68=s.nextInt();
									if(check68==otp_in68)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount69=s.nextDouble();
								if(amount69==bill15)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp69=9999*Math.random()+9999;
									int check69=(int)otp69;
									System.out.println(check69);
									int otp_in69=s.nextInt();
									System.out.println("Enter Your PIN:");
									int pin18=s.nextInt();
									if(check69==otp_in69)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount70=s.nextDouble();
								if(amount70==bill15)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp70=9999*Math.random()+9999;
									int check70=(int)otp70;
									System.out.println(check70);
									int otp_in70=s.nextInt();
									if(check70==otp_in70)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;
							}
						}
					break;}
					case 3:
					{
						int price17=200;
						System.out.println("Please Enter The Quantity");
						int qty18=s.nextInt();
						double bill16=qty18*price17;
						System.out.println("The Total Bill is :"+bill16+"\n");
						System.out.println("Please Select The Payment Method\n1.Phone Pay\n2.Google Pay\n3.Paytm\n4.Card\n5.Cash");
						int payment15=s.nextInt();
						switch(payment15)
						{
							case 1:
							{
								System.out.println("Please Enter The Amount");
								double amount71=s.nextDouble();
								if(amount71==bill16)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp71=9999*Math.random()+9999;
									int check71=(int)otp71;
									System.out.println(check71);
									int otp_in71=s.nextInt();
									if(check71==otp_in71)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;
							}
							case 2:
							{
								System.out.println("Please Enter The Amount");
								double amount72=s.nextDouble();
								if(amount72==bill16)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp72=9999*Math.random()+9999;
									int check72=(int)otp72;
									System.out.println(check72);
									int otp_in72=s.nextInt();
									if(check72==otp_in72)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;
							}
							case 3:
							{
								System.out.println("Please Enter The Amount");
								double amount73=s.nextDouble();
								if(amount73==bill16)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp73=9999*Math.random()+9999;
									int check73=(int)otp73;
									System.out.println(check73);
									int otp_in73=s.nextInt();
									if(check73==otp_in73)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;
							}
							case 4:
							{
								System.out.println("Please Enter The Amount");
								double amount74=s.nextDouble();
								if(amount74==bill16)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp74=9999*Math.random()+9999;
									int check74=(int)otp74;
									System.out.println(check74);
									int otp_in74=s.nextInt();
									System.out.println("Enter Your PIN:");
									int pin20=s.nextInt();
									if(check74==otp_in74)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;
							}
							case 5:
							{
								System.out.println("Please Enter The Amount");
								double amount75=s.nextDouble();
								if(amount75==bill16)
								{
									System.out.println("Please Enter The OTP:");
									Thread.sleep(1000);
									double otp75=9999*Math.random()+9999;
									int check75=(int)otp75;
									System.out.println(check75);
									int otp_in75=s.nextInt();
									if(check75==otp_in75)
									{
										System.out.println("Processing Please Wait.....");
										Thread.sleep(1000);
										System.out.println((char)1+"Your Order Is Sucessful"+(char)1);
										System.out.println("\tTHANKS FOR ORDERING\t"+(char)1);

									}
									else
									{
										System.out.println("Please Enter The Correct OTP");
									}
								}
							break;
							}
						}
					break;}
					case 4:
					{
						System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
					}
				}
			break;}
			case 5:
			{
				System.out.println("THANKS FOR VISITING THE APP");
			}
		}
	}
}