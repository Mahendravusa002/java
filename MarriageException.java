//import java.util.Scanner;
class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
		super(msg);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String msg)
	{
		super(msg);
	}
}
class MarriageException
{
	public static void main (String args[])
	{
		//Scanner s= new Scanner(System.in);
		//System.out.println("Enter age:");
		int age=Integer.parseInt(args[0]);
		if (age>60)
		{
			throw new TooOldException("Too Old... No chance to get marry");
		}
		else if (age<18)
		{
			throw new TooYoungException("Too Young.. Please Wait sometime");
		}
		else
		{
			System.out.println("Registered Successfully");
		}
	}
}
 
