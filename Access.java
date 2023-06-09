package modifiers;
class Access
{
	 void sum()
	{
		int a=8, b=9,c=a+b;
		System.out.println("sum of numbers is"+c);
	}
       public static void main(String args[])
	{
		Access z=new Access();
		z.sum();
	}

}