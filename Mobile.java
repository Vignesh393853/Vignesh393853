class Mobile
{
String name, color, storage, ram; 
	 public Mobile() 
	 {}
	 public Mobile(String name, String color, String storage, String ram) 
	 {
	 //L.I 
	 this.name=name; 
	 this.color=color;
	 this.storage=storage; 
	 this.ram=ram; 
	 }
	 Sim slot;//Lazy Instantiation //Features 
	 public void addSim(Sim slot) 
	 {
		 if(this.slot==null)
			 {
			 this.slot=slot;
				 System.out.println("Sim Added Succesfully");
			 } //sim is Added 
			 else
			 System.out.println("Can't Add Already sim is Present");
			 }
			 public void removeSim() 
				 { 
				 if(this.slot!=null)
					 { 
					 this.slot=null; //Sim is removed 
					 System.out.println("Sim Removed Succesfully");
					 }
					  else 
					 System.out.println("Thier is No Sim To Remove "); 
				 }
				 public boolean isSimPresent() { 
					 if(this.slot!=null)
						 return true;//sim is Present
					 else
						 					 return false;//sim is Not Present
				 }
					 public void detailsOfMobile() { 
						 System.out.println("The Mobile Name is :"+name);
						 System.out.println("The Mobile Color is :"+color);
						 System.out.println("The Mobile Storage is:"+this.storage);
						 System.out.println("The Mobile Ram is :"+ram);
						 System.out.println("********************************");
					 }
				 }


