class EgException1
{
	public static void main(String args[])
	{
		try
		{
			int a=20,b=0,c;
			c=a/b;
			System.out.println("Result is"+c);
		}
		catch(Exception e)
		{
			System.out.println("Error is :"+e);
		}
	}
}
			
