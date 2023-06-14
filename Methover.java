import java.util.*;
class Parent
{
	public void fact(int a)
	{
		System.out.println("Find Factorial in Parent class");
	}
}		
class Methover extends Parent
{
	public  void fact(int a)
	{
		System.out.println("Finding Factorial in Child class");
		int i=1,m=1;
		for (i=1;i<=a;i++)
		{
			m=m*i;
		}
		System.out.println("Factorial is "+m);
	}
	public static void main(String args[])
	{
		Scanner s= new Scanner (System.in);
		System.out.println("Enter number to find factorial");
		int n= s.nextInt();
		Methover m=new Methover();
		m.fact(n);
		
	}
}

		
