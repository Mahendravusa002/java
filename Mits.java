interface Buildings
{
	public void circularblock();
	public void westblock();
}
class Mits implements Buildings
{
	public void circularblock()
	{
		System.out.println("circular block consists of 12 computer labs");
	}
	public void westblock()
	{
		System.out.println("In west block AIDS ,MECHANICAL ,CSE departments are there");
	}
	public static void main(String args[])
	{
		 Mits m= new  Mits();
		 m.circularblock();
		 m.westblock();
	}
}

		
		
	
