import java.util.Arrays;
import java.lang.String;
class EgException2
{
	public static void main(String args[])
	{
		try
		{	String s="Mahendra";
			//int a=123;
			int a1[]={1,2,3,4,5};
			int s1=Integer.parseInt("10");
			System.out.println("String value is:"+s1);
			System.out.println("Array value: "+a1[0]);
			System.out.println("String values:"+s.charAt(30));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error is :"+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error is :"+e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Error is :"+e);
		}	
		finally
		{
			System.out.println("Final block completed");
		}
		
	}
} 
