 final class Parent
{
	 void prime(int n)
	{
		int  count=0;
		for (int i=1;i<=n/2;i++)
		{
			if (n%i==0)
			  count++;
		}
		if (count==1)
		 System.out.println(n+"is prime number");
		else
		 System.out.println(n+"is not prime number");
		
	}
}
class Child extends Parent
{
	public static void main(String[] args)
	{
		Child c=new Child();
	    c.prime(25);
	 }
}

		                                                                                               
