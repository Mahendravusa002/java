abstract class Details
{ 
	abstract void engine();
	abstract void price();
	abstract void model();
	final String colour="BLACK";
	final String company="BENZ";
}
class Benz extends Details
{
	
	void model()
	{
		System.out.println("THE DETAILS OF "+super.company+" CAR DETAILS");
	    System.out.println("colour is "+super.colour);
		System.out.println("Model is BENZ Q690");
	}
	void engine()
	{
		System.out.println(" It Consists of DIESEL,PETROL Engines ");
	}
	void price()
	{
		System.out.println("Cost of Diesel engine car is FIFTY lakhs");
		System.out.println("Cost of Petrol engine car is SEVENTY lakhs");
	}
	
	public static void main(String args[])
	{
		Benz b= new Benz();
		b.model();
		b.engine();
		b.price();
	}
}
