class Sim
{
	//states
	String name; 
	String local_call_rate;
	String band_width;
	//Constructors 
	public Sim() {}
		public Sim(String name, String local_call_rate, String band_width) { 
		//L.I
		this.name=name; 
		this.local_call_rate=local_call_rate; 
		this.band_width=band_width; 
		} //Behaviours
		public void detailsOfSim() 
			{ 
			System.out.println("The Sim Name is :"+name); 
			System.out.println("The Sim Local Call Rate is :"+local_call_rate); 
			System.out.println("The Sim Band Width is :"+band_width); 
			System.out.println("");
			} }