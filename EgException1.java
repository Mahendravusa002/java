import java.lang.String;
class EgException1
{
	public static void main(String args[])
	{
		try
		{
			int a=20,b=0,c;
			c=a/b;
			System.out.println("Result is"+c);
			String name=null;
			System.out.println("Length is"+name.length());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error is :"+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Error is:"+e);
		}
		finally
		{
			System.out.println("final block Completed");
		}
	}
}
			
